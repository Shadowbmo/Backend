/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.cursojavabasico.lambdaestram;

import java.util.List;
import java.util.Arrays;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

/**
 *
 * @author dssilva21
 */
public class LambdaStream {

    static int gerarIdade(int min, int max) {
        return new SplittableRandom().nextInt(min, max);
    }

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Alice", "João", "Maria", "Pedro", "Raquel", "Sameul");
        System.out.println("Lista de nomes \n");
        List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa(n, gerarIdade(15, 30))).collect(Collectors.toList());

        nomes.forEach((n) -> System.out.println(n));
        System.out.println("\n Lista de pessoas: \n");
        pessoas.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));

        System.out.println("\nLista de pessoas maiores de idade: \n ");
        List<Pessoa> pessoasMaioresDeIdade
                = pessoas.stream().filter((p)
                        -> p.getIdade() >= 18).collect(Collectors.toList());

        pessoasMaioresDeIdade.forEach((p) -> System.out.println(p.getNome() + " "
                + p.getIdade()));

        System.out.println("\nLista de pessoas Ordenadas \n");
        List<Pessoa> pessoasOrdenadas
                = pessoasMaioresDeIdade.stream().sorted((p1, p2) -> p1.getIdade()
                - p2.getIdade()).collect(Collectors.toList());
        pessoasOrdenadas.forEach(p -> System.out.println(p.getNome() + " "
                 + p.getIdade()));
    
        System.out.println("\n Soma das idades");
        Integer totalIdade = pessoasOrdenadas.stream().map(p ->
                p.getIdade()).reduce(0,(somaIdade, idade) -> somaIdade += idade) ;

        System.out.println("Total: " + totalIdade);
        
//        [
//        nome: "Alice",
//        idade: 20
//        ],
    }

}
