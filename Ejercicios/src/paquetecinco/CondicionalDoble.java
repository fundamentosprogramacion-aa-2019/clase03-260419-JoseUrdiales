/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;
import java.util.Scanner;
import paquetedos.MiMensaje;

/**
 *
 * @author Jose Luis
 */
public class CondicionalDoble {
     public static void main(String[] args){
         
        // ingreso por teclado de calificacion
        // importar desde la clase MiMensaje: Aprobación
        // importar desde la clase MiMensaje: Reprobación
        
        Scanner entrada = new Scanner (System.in);
        int calificacion = entrada.nextInt();
        
        String Mensaje = MiMensaje.mensajeuno;
        String MensajeNdos = MiMensaje.mensajedos;
        if (calificacion >= 80){
            System.out.printf("Su %s es con %s puntos :", Mensaje, 
                    calificacion);  
        }else{
            System.out.printf("Su %s es con %s puntos :", MensajeNdos, 
                    calificacion); 
         }
     }
}
