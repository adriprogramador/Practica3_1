package com.mycompany.practica3_1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Usuario
 */
public class HibernateUtil {
    
 private static SessionFactory sessionFactory;
 private static Session session;
 /**
 * Crea la factoria de sesiones
 */
 public static void buildSessionFactory() {
 Configuration configuration = new Configuration();
 configuration.configure();
 // Se registran las clases que hay que mapear con cada tabla de  la base de datos
 
 configuration.addAnnotatedClass(Heroe.class);
 configuration.addAnnotatedClass(Añadirpoder.class);
 configuration.addAnnotatedClass(Villano.class);
 
 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
       configuration.getProperties()).build();
 
 sessionFactory =  configuration.buildSessionFactory(serviceRegistry);

 }
 /**
 * Abre una nueva sesión
 */
 
 public static void openSession() {
     if((sessionFactory == null) || (!sessionFactory.isOpen())){
    buildSessionFactory();
    session = sessionFactory.openSession();
     }
  
 }
 /**
 * Devuelve la sesión actual
 * @return
 */
 public static Session getCurrentSession() {
    if ((session == null) || (!session.isOpen())){
      openSession();
    }
    return session;
 }
 /**
 * Cierra Hibernate
 */
 
 public static void closeSessionFactory() {
        if (session != null){
            session.close();
        }
        if (sessionFactory != null){
            sessionFactory.close();
        }
    }
   
}
