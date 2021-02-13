
package com.mycompany.practica3_1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Poder")

public class Añadirpoder {
    @Id 
   @GeneratedValue(strategy = IDENTITY)
    
    @Column(name="PoderId")
    
    private int Id;
    
    @Column(name="Descripcion")
 
    private String Descripcion;
 
    @Column(name="nombre")
 
    private String Nombre;

       public int getId(){
        return Id;
    }
    
    public void setId(int id){
        this.Id = id;
    }

public String getDescripcion(){
        return Descripcion;
    }
 
public void setDescripcion( String Descripcion){
     
    this.Descripcion= Descripcion;  
}

 public String getnombre(){
        return Nombre;
    }
    
    public void setnombre(String nombre){
        this.Nombre = nombre;
    }

    public Añadirpoder( int id, String descripcion, String nombre ){
    
    this.Id= id;
    this.Descripcion= descripcion;
    this.Nombre= nombre;

    }

public Añadirpoder(){

}


}


    
    

