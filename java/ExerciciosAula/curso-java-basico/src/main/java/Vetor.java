/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dssilva21
 */
public class Vetor {
    public static void main(String[] args) {
        int notas[] = new int[10];
        
        notas[0] = 1;
        notas[2] = 5;
        notas[6] = 9;
        notas[4] = 2;
        notas[1] = 4;
        notas[9] = 7;
        notas[7] = 8;
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        String carros[] = new String[] {"BMW","Mercerdes","BMW","Mercerdes","Tesla"};
        
        System.out.println(carros.length);
        
        for (String carro : carros) {
            System.out.println(carro);
        }
    
    }
  
}
