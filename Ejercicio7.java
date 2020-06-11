/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        System.out.println("Implementación de un Multimodelo Neuronal Jerárquico para Identificación y Control de Sistemas Mecánicos");
        System.out.println("Ingrese Clase de objeto :");
        String carac7 =objeto.nextLine();
        System.out.println("\n Atributos :");
        System.out.println("\nIngrese Atributo 1 :");
        String iatri1 =objeto.nextLine();
        System.out.println("\nIngrese Atributo 2 :");
        String iatri2 =objeto.nextLine();
        System.out.println("\nIngrese Atributo 3 :");
        String iatri3 =objeto.nextLine();
        System.out.println("\nIngrese Atributo 4 :");
        String iatri4 =objeto.nextLine();

        System.out.println("\n Servicios :");
        System.out.println("\nIngrese Servicio 1 :");
        String servi1 =objeto.nextLine();
        System.out.println("\nIngrese Servicio 2 :");
        String servi2 =objeto.nextLine();
        System.out.println("\nIngrese Servicio 3 :");
        String servi3 =objeto.nextLine();
        System.out.println("\nIngrese Atributo 4 :");
        String servi4 =objeto.nextLine();
    }

}
