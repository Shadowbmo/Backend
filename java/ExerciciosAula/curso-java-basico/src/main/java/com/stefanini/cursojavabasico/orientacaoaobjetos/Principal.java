/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.cursojavabasico.orientacaoaobjetos;

import com.stefanini.cursojavabasico.orientacaoobjetos.entidades.Tesla;
import com.stefanini.cursojavabasico.orientacaoobjetos.entidades.BMW;

/**
 *
 * @author dssilva21
 */
public class Principal {
//int valor = 10; da erro criada aqui

    static int valor = 10;

    static void print() {
        System.out.println(valor);
    }

    public static void main(String[] args) {
        valor = 10;
        print();

//  ----------------------   Criação de news   -------------------------------
//        Carro bmw = new Carro();
//        Carro mercedes = new Carro("mercedes", "c180");
        BMW bmwDois = new BMW() {
            @Override
            public void AcionarTurbo() {
            }
        };
        BMW bmwTres = null;

        Tesla tesla = new Tesla();
        Tesla teslaDois = new Tesla();
        Carro[] carros = new Carro[]{bmwDois, tesla, teslaDois};
// -----------------  Ultilizando Get e Set   ------------------------------
//
//        bmw.setMarca("BMW");
//        bmw.setModelo("M3");
//        bmw.setQuilometroPorLitro(7.5);
//        bmw.taxaAceleracao = 50;
//        bmw.setVelocidadeMaxima(280);
//        System.out.println(mercedes.getMarca());
//        System.out.println(mercedes.getModelo());
//
//
//
//        System.out.println(bmw);
//        System.out.println(bmw.getMarca());
//        System.out.println(bmw.getModelo());
//        System.out.println(bmw.getQuilometroPorLitro());
//        System.out.println(bmw.getTaxaAceleracao());
//        System.out.println(bmw.getVelocidadeMaxima());
//
//
// ---------------------   Algumas funções/Execuções   -------------------------
//
//        tesla.isDirigeSozinho();
//        bmw.acelerar();
//        bmw.frear();
//        System.out.println(bmw.calcularTaxaDeAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
//        System.out.println(bmw.calcularTaxaDeAceleracao(bmw.getVelocidadeMaxima(), 5)); 
//        tesla.isDirigeSozinho();
        ((Tesla) teslaDois).setDirigeSozinho(true);
        System.out.println(((Tesla) teslaDois).isDirigeSozinho());
        Calcular.soma(0, 0);
        bmwDois.piscarAlerta();
        teslaDois.piscarAlerta();
        System.out.println(bmwDois.calcularTaxaDeAceleracao(100, 5));
        bmwDois.calcularTaxaDeAceleracao(100.50, 10);
        tesla.calcularTaxaDeAceleracao(100.50, 10);
//        bmwTres.acelerar();

// ----------------------------- Alguns erros --------------------------------
//        bmwDois.isDirigeSozinho não tem acesso  
//        Constantes.MARCA_FAMOSA = "ferrari";
// ---------------------------- Alguns comandos ------------------------------
        for (Carro carro : carros) {
            if (Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
                System.out.println("carro de marca famosa");
            }
            if (carro instanceof Tesla) {
                System.out.println(((Tesla) teslaDois).isDirigeSozinho());
            }
        }

        try {
            bmwDois.setVelocidadeMaxima(-10);

        } catch (NegocioException e) {
            System.out.println(e);
        } finally {
            System.out.println("passou aqui");
        }
    }
}
