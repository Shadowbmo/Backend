/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.stefanini.orientacaoobjetos.executor;

import br.com.stefanini.orientacaoobjetos.BMW;
import br.com.stefanini.orientacaoobjetos.Carro;
import br.com.stefanini.orientacaoobjetos.Mercedes;

/**
 *
 * @author dssilva21
 */
public class Executor {

    public static void main(String[] args) {
//      Carro carro1 = new Carro();
//        carro1.marca = "BMW";
//        carro1.modelo = "320i";
//        carro1.chassi = 9999;
//        carro1.placa ="AAA9999" ;
//        carro1.bancos = 5 ;
//        carro1.roda = 20 ;
//        
//        System.out.println(carro1.modelo);
//        System.out.println(carro1.chassi);
//        System.out.println(carro1.placa);
//        System.out.println(carro1.bancos);
//        System.out.println(carro1.marca);
//        System.out.println(carro1.roda);
//        
//        Carro carro2 = new Carro();
//        
//        carro2.marca = "Mercedes";
//        carro2.modelo = "C180";
//        carro2.chassi = 8888;
//        carro2.placa = "BBB8888";
//        carro2.bancos = 5;
//        carro2.roda = 21;
//        
//        System.out.println(carro2.modelo);
//        System.out.println(carro2.chassi);
//        System.out.println(carro2.placa);
//        System.out.println(carro2.bancos);
//        System.out.println(carro2.marca);
//        System.out.println(carro2.roda);

          Carro carro1 = new Carro();
          carro1.setMarca("BMW");
          carro1.setModelo("320i");
          carro1.setChassi(9999);
          carro1.setPlaca("XXXX9999");
          carro1.setBancos(5);
          carro1.setRoda(20);
          carro1.setVelocidade(200);
          
          System.out.println(carro1.getMarca());
          System.out.println(carro1.getModelo());
          System.out.println(carro1.getChassi());
          System.out.println(carro1.getPlaca());
          System.out.println(carro1.getBancos());
          System.out.println(carro1.getRoda());
          
          System.out.println(carro1.acelerar());
          
          Carro carro2 = new Carro("Mercedes");
          System.out.println(carro2.getMarca());
          
          System.out.println(soma(10,5));
          System.out.println(soma(10,15,6));
          
          BMW bmw = new BMW();
          bmw.setVelocidade(100);
          System.out.println(bmw.acelerar());  
          Mercedes mercedes = new Mercedes();
          System.out.println(mercedes.acelerar());
    }
    
    public static int soma(int a, int b){
        return a + b;
    }
    
    public static int soma (int a, int b, int c){
        return a + b + c;
    }
}
