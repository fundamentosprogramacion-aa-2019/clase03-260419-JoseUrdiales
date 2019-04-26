/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;
import paquetedos.MiMensaje;
import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class condicionalsimple {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        
        int calificacion = entrada.nextInt();
        String miMensaje = MiMensaje.mensajeuno;
        
        
        if (calificacion >= 85) {
            System.out.printf("%s con %d puntos \n", miMensaje, calificacion);
        }
       
        int calificacion_2 = entrada.nextInt();
        if (calificacion_2 >= 85) {
            System.out.printf("%s con %d puntos \n", miMensaje, 
                    calificacion_2);
        }
    }
    
}
