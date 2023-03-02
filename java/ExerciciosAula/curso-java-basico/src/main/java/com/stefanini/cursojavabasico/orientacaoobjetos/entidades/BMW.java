/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.cursojavabasico.orientacaoobjetos.entidades;

import com.stefanini.cursojavabasico.orientacaoaobjetos.Carro;
import com.stefanini.cursojavabasico.orientacaoaobjetos.Conversivel;
import com.stefanini.cursojavabasico.orientacaoaobjetos.Esportivo;
import com.stefanini.cursojavabasico.orientacaoaobjetos.Ultilitario;

/**
 *
 * @author dssilva21
 */
public abstract class BMW extends Carro implements Conversivel, Ultilitario {

    public BMW() {
        super();
        System.out.println("Construindo um carro BMW");

    }

    public void piscarAlerta() {
        System.out.println("BMW Piscando Alerta....");
    }

    public double calcularTaxaDeAceleracao(double velocidadeFinal, double tempoFinal) {
        System.out.println("sobrescrita");
        return velocidadeFinal / tempoFinal;
    }

    public void acionarTurbo() {
        
    }
    
    public void passear(){
        
    }
    
    public void abrirCapo(){
        
    }
}
