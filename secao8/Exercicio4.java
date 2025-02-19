package secao8;

import java.util.Arrays;

/*
    > Exercício 4: Substituir Valores em um Array com Condição

    Escreva um programa que receba um array de inteiros 
    e substitua todos os valores negativos por zero. 
    Exiba o array antes e depois da modificação.


    // [ -1, 2 , 3]
    // [0, 2, 3]
     */
public class Exercicio4 {
    public static void main(String[] args) {
        int[] arrays = { -1, 2 , 3, -10, -5, 0 };
        System.out.println("Antes da modificação: " + Arrays.toString(arrays));

        for(int i = 0; i < arrays.length; i++){
            if(arrays[i] < 0){
                arrays[i] = 0;
            }
        }
        System.out.println("Depois da modificação: " + Arrays.toString(arrays));

    }
}
