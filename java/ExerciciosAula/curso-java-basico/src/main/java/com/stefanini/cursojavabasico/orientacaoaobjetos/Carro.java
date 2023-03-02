/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.cursojavabasico.orientacaoaobjetos;

/**
 *
 * @author dssilva21
 */
public abstract class Carro {

    private String marca;
    private String modelo;
    private int velocidadeMaxima;
    private int taxaAceleracao;
    private double quilometroPorLitro;

    public Carro() {
        System.out.println("construindo um carro");
    }

    public abstract void piscarAlerta();

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("freando...");
    }

    public double calcularTaxaDeAceleracao(double velocidadeFinal,
            double velocidadeInicial, double tempoFinal, double tempoInicial) {
        return (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial * 3.6);
    }

    public double calcularTaxaDeAceleracao(double velocidadeFinal, double tempoFinal) {
        return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) throws NegocioException {
        if (velocidadeMaxima < 0) {
            throw new NegocioException("Valor é inválido");
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public int getTaxaAceleracao() {
        return taxaAceleracao;
    }

    public void setTaxaAceleracao(int taxaAceleracao) {
        this.taxaAceleracao = taxaAceleracao;
    }

    public double getQuilometroPorLitro() {
        return quilometroPorLitro;
    }

    public void setQuilometroPorLitro(double quilometroPorLitro) {
        this.quilometroPorLitro = quilometroPorLitro;
    }

}
