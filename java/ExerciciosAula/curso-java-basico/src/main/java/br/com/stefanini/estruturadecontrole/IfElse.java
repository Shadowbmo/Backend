/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.stefanini.estruturadecontrole;

/**
 *
 * @author dssilva21
 */
public class IfElse {
    public static void main(String[] args) {
        int nota = 7;
        
//        if
        if (nota >= 7 ){
            System.out.println("Aprovado");
        }
        
//        if sem bloco
          if (nota >= 7) System.out.println("Aprovado");
          
//          if sem bloco
         if (nota >= 9)
             System.out.println("Aprovado");
             System.out.println("Parabens");
             
//             if e else
          if (nota >= 7) {
              System.out.println("Aprovado");
        } else{
              System.out.println("Reprovado");
          }   
          
//          if else if

        if (nota >= 9) {
            System.out.println("Aprovado");
            System.out.println("Parabens");
        } else if (nota >= 7) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reporvado");
        }
    }
  
}
