/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hospital");
        String nom = entrada.nextLine();
        System.out.println("Ingrese la ciudad");
        String ciu = entrada.nextLine();
        System.out.println("Ingrese el numero de Doctores");
        int doc = entrada.nextInt();
        System.out.println("Ingrese el numero de enfermeros");
        int enf = entrada.nextInt();
        Hospital h3 = new Hospital(nom,ciu,doc,enf);
        Hospital h1 = new Hospital("Militar", "Loja", 1000, 3000);
        
        h1.establecerNombre("Hospital Militar Privado");
        
        Hospital h2 = new Hospital("Militar DOS", "Loja", 1000, 3000);
        
        System.out.printf("%s\n", h1);
        System.out.printf("%s\n", h2);
        System.out.printf("%s\n", h3);
        
    }
}
