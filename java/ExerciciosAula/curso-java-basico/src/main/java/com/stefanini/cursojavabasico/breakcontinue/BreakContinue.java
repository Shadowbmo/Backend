/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.cursojavabasico.breakcontinue;

/**
 *
 * @author dssilva21
 */
public class BreakContinue {
    public static void main(String[] args) {
        String[] carros = new String[] {"BMW i320", "Mercedes c180","Tesla Model S"};
        
        for (int i = 0; i < 10; i++) {
            if (carros[i] == "BMW i320") {
                      System.out.println(carros[i]);
            break; 
            }
            System.out.println(carros[i]);
      
        }
        
               for (int i = 0; i < 10; i++) {
            if (carros[i] == "BMW i320") {
                      System.out.println(carros[i]);
           continue; 
            }
                   System.out.println("Quero esse carro");
            System.out.println(carros[i]);
      
        }
    }
}
