/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import paquetetres.Demo;
import paquetecuatro.DemoDos;


/**
 *
 * @author Jose Luis
 */
public class Principal {
     public static void main(String[] args) {
         int suma = Demo.valor + DemoDos.valorDos;
         int multiplicacion = Demo.valor * DemoDos. valorDos;
         
         System.out.printf("%d\n", suma);
         System.out.printf("%s\n", multiplicacion);
     }
}
