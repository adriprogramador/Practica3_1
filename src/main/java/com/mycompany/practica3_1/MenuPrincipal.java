package com.mycompany.practica3_1;

import com.mycompany.practica3_1.HibernateUtil;
import com.mycompany.practica3_1.Añadirpoder;
import org.hibernate.Session;
import java.util.Scanner;

public class MenuPrincipal {

     private static Scanner scanner = new Scanner(System.in);
    private static Heroe heroe = null;
    private static Villano villano = null;
    
    public static void main(String[] args) {

        boolean salir = false;
        int opcionSeleccionada = 0;
        String mensaje = "";
        while (salir == false) {

            opcionSeleccionada = obtenerValorNumerico("¿Qué opción eliges?");
            switch (opcionSeleccionada) {
                // SALIR
                case 0:
                    salir = true;
                    break;
                // CARGAR GRUPO DE HEROES O VILLANOS
                case 1:
                    mensaje = "0. Heores\n"
                            + "1. Villanos\n"
                            + "2. Salir";
                    opcionSeleccionada = obtenerValorNumerico(mensaje);

                    break;
                // MOSTRAR TODOS LOS HÉROES O VILLANOS
                case 2:
                    mensaje = "0. Heores\n"
                            + "1. Villanos\n"
                            + "2. Salir";
                    opcionSeleccionada = obtenerValorNumerico(mensaje);

                    break;
                // SELECCIONAR UN HÉROE O VILLANO A MODIFICAR.
                case 3:
                    mensaje = "0. Heore\n"
                            + "1. Villano\n"
                            + "2. Salir";
                    opcionSeleccionada = obtenerValorNumerico(mensaje);

                    break;
                // ELIMINAR HÉROE O VILLANO.
                case 4:
                    mensaje = "0. Heores\n"
                            + "1. Villanos\n"
                            + "2. Salir";
                    opcionSeleccionada = obtenerValorNumerico(mensaje);

                    break;
                //  COMBATE.
                case 5:
                    mensaje = "0. Heores\n"
                            + "1. Villanos\n"
                            + "2. Salir";
                    opcionSeleccionada = obtenerValorNumerico(mensaje);
                    break;
                default:
                    break;
            }

        }

    }
        
         private static int obtenerValorNumerico(String mensaje) {
        int numero = 0;
        while (true) {
            try {
                System.out.print(mensaje);
                String entradaTeclado = scanner.nextLine();
                numero = Integer.parseInt(entradaTeclado);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un valor numerico...");
            }
        }
        return numero;
    }

    private static String obtenerValorString(String mensaje) {
        String valor = "";
        while (true) {
            System.out.print(mensaje);
            String entradaTeclado = scanner.nextLine();
            if (entradaTeclado.trim().length() != 0) {
                break;
            }
            System.out.println("Ingrese un valor...");
        }
        return valor;
    }

    private static double obtenerValorNumericoDecimal(String mensaje) {
        double numero = 0;
        while (true) {
            try {
                System.out.print(mensaje);
                String entradaTeclado = scanner.nextLine();
                numero = Double.parseDouble(entradaTeclado);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un valor numerico decimal...");
            }
        }
        return numero;
    }

    private static String[] obtenerListado(int opction) {
        String[] listado = null;
        switch (opction) {
            // HEROE
            case 1:

                break;
            // VILLANO
            case 2:

                break;
            // PODER
            case 3:

                break;
            default:
                break;
        }
        return listado;
    }
  
    private static void ingresarValoresHeroe() {
        heroe = new Heroe();
        heroe.setAlias(obtenerValorString("Alias: "));
        heroe.setAtaque(obtenerValorNumerico("Ataque: "));
        heroe.setDebilidades(obtenerValorString("Debilidades: "));
        heroe.setDefensa((int) obtenerValorNumericoDecimal("Defensa: "));
        heroe.setFortaleza(obtenerValorString("Fortalezas: "));
        heroe.setNivel(obtenerValorNumerico("Nivel: "));
        heroe.setNombre(obtenerValorString("Nombre: "));
        heroe.setVida((int) obtenerValorNumericoDecimal("Vida: "));
    }

    private static void ingresarValoresVillano(){
        villano = new Villano();// esta linea me da conflicto
        villano.setAlias(obtenerValorString("Alias: "));
        villano.setAtaque(obtenerValorNumerico("Ataque: "));
        villano.setDebilidades(obtenerValorString("Debilidades: "));
        villano.setDefensa((int) obtenerValorNumericoDecimal("Defensa: "));
        villano.setNivel(obtenerValorNumerico("Nivel: "));
        villano.setNombre(obtenerValorString("Nombre: "));
        villano.setVida((int) (double) obtenerValorNumericoDecimal("Vida: "));        
    }
    
    private static void generarHeroes() {
        Heroe h1 = new Heroe();
        h1.setNombre("Kakaroto");
        h1.setAlias("Goku");
        h1.setAtaque(20);
        h1.setDefensa(10);
        h1.setNivel(1);
        h1.setVida(100);
        h1.setDebilidades("Inocencia");
        h1.setFortaleza("Perseverancia");

        Heroe h2 = new Heroe();
        h2.setNombre("Oliver Atom");
        h2.setAlias("El sin piernas");
        h2.setAtaque(15);
        h2.setDefensa(5);
        h2.setNivel(1);
        h2.setVida(40);
        h2.setDebilidades("La realidad");
        h2.setFortaleza("Imaginación");

        Heroe h3 = new Heroe();
        h3.setNombre("Roberto Gómez Bolaños");
        h3.setAlias("El Chapulín Colorado");
        h3.setAtaque(10);
        h3.setDefensa(2);
        h3.setNivel(1);
        h3.setVida(60);
        h3.setDebilidades("Critica");
        h3.setFortaleza("Originalidad");

        Heroe h4 = new Heroe();
        h4.setNombre("Ash Ketchum");
        h4.setAlias("El puberto inmortal");
        h4.setAtaque(15);
        h4.setDefensa(6);
        h4.setNivel(1);
        h4.setVida(30);
        h4.setDebilidades("Critica");
        h4.setFortaleza("Originalidad");

    }

    private static void generarVillanos( ) {
        Villano v1 = new Villano (); // esta linea me da conflicto
        v1.setNombre("Chuckles");
        v1.setAlias("El Cerdito");
        v1.setAtaque(17);
        v1.setDefensa(12);
        v1.setNivel(1);
        v1.setVida(35);
        v1.setDebilidades("Orgullo");

    }

}
      
        
        
 
   
  
    



