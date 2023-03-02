/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.cursojavabasico.orientacaoobjetos.entidades;

import com.stefanini.cursojavabasico.orientacaoaobjetos.Carro;

/**
 *
 * @author dssilva21
 */
public class Tesla extends Carro {

    private Boolean dirigeSozinho;

    public Tesla() {
        super();
        System.out.println("Construindo um carro Tesla");
    }

    public Boolean isDirigeSozinho() {
        return dirigeSozinho;
    }

    @Override
    public double calcularTaxaDeAceleracao(double velocidadeFinal, double tempoFinal) {
        System.out.println("Tesla sobrescrita");
        return velocidadeFinal * tempoFinal;
    }

    public void setDirigeSozinho(Boolean dirigeSozinho) {
        this.dirigeSozinho = dirigeSozinho;
    }

    /**
     *
     */
    @Override
    public void piscarAlerta() {
        System.out.println("Tesla Piscando alerta...");
    }
}
