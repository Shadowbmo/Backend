/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.cursojavabasico.estruturacontrole;

/**
 *
 * @author dssilva21
 */
public class IfElse {

    public static void main(String[] args) {
        int idade = 17;

        if (idade >= 18) {
            System.out.println("maior de idade");
        }
        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
    }
        
        if(idade >= 100){
            System.out.println("virou uma mumia");
        }
        else if (idade >= 18){
            System.out.println("Maior de idade");
        }   else{
            System.out.println("Menor de idade");
        }
        
        if (idade >= 18) System.out.println("maior de idade");
        System.out.println("sua idade: " + idade);
    }

}
