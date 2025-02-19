package secao8;
/* > Exercício 2: Encontrar o Elemento Mais Frequente em um Array

    Desenvolva um programa que receba um array de inteiros 
    e determine qual elemento aparece com maior frequência. 
    Caso haja empate, exiba todos os elementos empatados. */
public class Exercicio2 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 5, 10, 1, 5, 5};
        int maisFrequente = arrays[0];
        int MaxContagem = 1;

        for(int i = 0; i < arrays.length; i++){
            int contagem = 0;

            for(int j = 0; j < arrays.length; j++){
                if(arrays[j] == arrays[i]){
                    contagem++;
                }
            }

            if(contagem > MaxContagem){
                MaxContagem = contagem;
                maisFrequente = arrays[i];
            }
        }

        System.out.println("Mais frequente :" + maisFrequente);
    }
}
