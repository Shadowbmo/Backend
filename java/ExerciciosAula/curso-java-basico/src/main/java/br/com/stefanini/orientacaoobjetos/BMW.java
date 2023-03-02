/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.stefanini.orientacaoobjetos;

/**
 *
 * @author dssilva21
 */ 

public class BMW extends Carro{
    public BMW(){
    this.setMarca("BMW");   
}
    
   public String acelerar(){
       return " A BMW pode fazer de 0 a ç[l"
               + "ç~.[~cxde " + this.getVelocidade() + " em 5s";
   }
    
 
}
