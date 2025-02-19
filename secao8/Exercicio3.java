package secao8;

import java.util.Arrays;

/* > Exercício 3: Transpor uma Matriz 2D

    Crie um programa que receba uma matriz 2D 
    e crie a matriz transposta (troca de linhas por colunas). 
    Exiba a matriz original e a matriz transposta.
     */
public class Exercicio3 {
    public static void main(String[] args) {
         int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];

        for(int[] linha : matrizTransposta) {
            System.out.println(Arrays.toString(linha));
        }

        for(int i =  0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        for(int[] linha : matrizTransposta) {
            System.out.println(Arrays.toString(linha));
        }
    }
}
