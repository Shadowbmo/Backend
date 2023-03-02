/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.cursojavabasico.estruturacontrole;

/**
 *
 * @author dssilva21
 */
public class Loop {
    public static void main(String[] args) {
        int count = 101;
        
    while(count < 10){
        System.out.println("count" + count);
        count++;
    }
    
    int countDois = 101;
        do {
            System.out.println(countDois);
            countDois++;
        } while (countDois < 100);
        
//        for normal
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        
        
        int i = 0;
        for (; i < 10;) {
            System.out.println(i);
            i++;
        }
        
//        for sem nada nas areas
        for (;;) {
            System.out.println("for");
        }
        
    }
}
