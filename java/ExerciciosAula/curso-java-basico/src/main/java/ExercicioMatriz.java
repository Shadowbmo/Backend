/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dssilva21
 */
public class ExercicioMatriz {
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;
       
       String[][] alunos = new String[linhas][colunas];
        
       alunos[0][0] = "Douglas";
       alunos[0][1] = "Capricornio";
       alunos[0][2] = "jão";
       
       alunos[1][0] = "João tenório";
       alunos[1][1] = "Virgem";
       alunos[1][2] = "Racionais";
       
       alunos[2][0] = "Caio ruiz";
       alunos[2][1] = "touro";
       alunos[2][2] = "Beyonce";
       
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\n O nome da pessoa é: " + alunos[i][0]);
            System.out.println(" O seu signo é: " + alunos[i][1]);
            System.out.println(" O seu cantor ou banda favorita é: " + alunos[i][2] + "\n");
            
        }
    }
 }

