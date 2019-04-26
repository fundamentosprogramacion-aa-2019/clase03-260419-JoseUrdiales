/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteejercicioclases;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class Matricula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String ciudad;
        String estadoCivil;
        int edad;
        double costo_matricula = 1200;
        double costo_final_matricula = 0;
        double descuento = 0;
        double impuesto = 0;
        
        System.out.println("Ingrese su ciudad de nacimiento: ");
        ciudad= entrada.nextLine();
        
        System.out.println("Ingrese su estado civil: ");
        estadoCivil= entrada.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad= entrada.nextInt();
        
        if (ciudad.equals ("Loja") || ciudad.equals("Zamora")){
            descuento = descuento + (costo_matricula * 20)/100;
        }
        
        if ((edad>=17) && (edad<20)){
            descuento = (costo_matricula * 10)/100;
        }
        
        if (estadoCivil.equals ("casado")){
            descuento = descuento + (costo_matricula * 5)/100;
        }
        impuesto = (costo_matricula * 2)/100;
        costo_final_matricula = costo_matricula - descuento;
        System.out.printf("Su matricula es %f :", 
                costo_final_matricula);
            
       
    }
            
}
