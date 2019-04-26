/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;
import java.util.Scanner;
import paquetedos.MiMensaje2;
/**
 *
 * @author Jose Luis
 */
public class CondicionalAninado {
    public static void main(String[] args) {
        // documentación

        Scanner entrada = new Scanner (System.in);
        int calificacion = entrada.nextInt();
        
        String Mensaje = MiMensaje2.mensajeuno;
        String Mensajedos = MiMensaje2.mensajedos;
        String Mensajetres = MiMensaje2.mensajetres;
        String Mensajecuatro = MiMensaje2.mensajecuatro;
        String Mensajecinco = MiMensaje2.mensajecinco;
        if (calificacion >= 90) {
            System.out.printf("%s %s con %d\n", Mensaje, Mensajedos, 
                    calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("%s %s con %d\n", Mensaje, Mensajetres, 
                        calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("%s %s con %d\n", Mensaje, Mensajecuatro, 
                            calificacion);

                } else {
                    System.out.printf("%s con %d\n", Mensajecinco, 
                            calificacion);
                }
            }
        }
    }
}
