package secao8;

import java.util.ArrayList;
import java.util.Arrays;

/* > Exercício 5: Remover Elementos Duplicados de um Array

    Desenvolva um programa que remova os elementos duplicados de um array de inteiros, 
    mantendo apenas a primeira ocorrência de cada valor. 
    Exiba o array original e o array sem duplicatas.

    [1, 1, 2, 2, 3, 1, 2, 3]
    [1, 2, 3]
     */
public class Exercicio5 {
    public static void main(String[] args) {
         int[] arrayComDuplicados = {1, 2, 2, 2, 3, 4, 4, 5};

        // array numerico sem qtd de elementos definida
        ArrayList<Integer> arraySemDuplicados = new ArrayList<>(); 
        
        for(int numero : arrayComDuplicados) {

            if(!arraySemDuplicados.contains(numero)) {
                arraySemDuplicados.add(numero);
            }

        }

        System.out.println(Arrays.toString(arrayComDuplicados));
        System.out.println(arraySemDuplicados);

    }
}
