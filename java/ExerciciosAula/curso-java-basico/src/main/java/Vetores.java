/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dssilva21
 */
public class Vetores {
    public static void main(String[] args) {
        int[] notas =  new int[10];
        
        notas[0] = 5;
        notas[3] = 9;
        // notas[11] = 19; da erro pois meu tamnho do array é até 10
        
        int[][] matriz  = new int[5][5];
        
        matriz [0][1] = 5;
        matriz [2][4] = 10;
        matriz [3][2] = 15;
        
        for (int[] m : matriz) {
            for (int v: m){
                System.out.println(v);
            }
            
        }
       
        
        String[] meses = new String [] {"janeiro", "feveiro", "março", "abril", "Maio"};
        System.out.println(meses.length);
        
        for (String m: meses) {
            System.out.println(m);
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        
    }   
}
