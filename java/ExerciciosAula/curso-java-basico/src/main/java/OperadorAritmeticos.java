/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dssilva21
 */
public class OperadorAritmeticos {
    public static void main(String[] args) {
        int soma = 10 + 5 ; // infix
        int subtracao = 10 - 5 ; //infix
        int multiplicacacao = 10 * 5 ; //infix
        int divisao = 10 / 5 ; //infix
        int modulo = 10 % 5 ; //infix 
        
        int a  = 10;
        
        a++; // postfix incrementa dps que a execução acaba
        ++a; // prefix incrementa antes da execução acabar
        
        System.out.println(++a == 11 );
    }
   
}
