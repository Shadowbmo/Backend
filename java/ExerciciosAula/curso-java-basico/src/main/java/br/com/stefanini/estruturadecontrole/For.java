/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.stefanini.estruturadecontrole;

/**
 *
 * @author dssilva21
 */
public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
//        for apenas com condição

        int i = 0;
        for (;i < 10;) {
            System.out.println(i);
            i++;
        }
        for (; ;) {
            System.out.println("loop infinito");   
        }
    }
}
