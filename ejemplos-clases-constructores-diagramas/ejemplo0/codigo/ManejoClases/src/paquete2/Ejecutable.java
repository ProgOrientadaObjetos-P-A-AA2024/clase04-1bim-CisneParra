/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

public class Ejecutable {

    public static void main(String[] args) {
        Computadora portatil = new Computadora("Intel- x19", 6.1 + 4.2);
        System.out.printf("%s - %.2f", portatil.obtenerTipoProcesador(),
                portatil.obtenerMemoria());

    }
}
