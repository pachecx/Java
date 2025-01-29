package secao6;
/* > Exercício 6 (Desafio): Função que Recebe um Array e Retorna o Maior Número

    Crie uma função que receba um array de inteiros 
    e retorne o maior número presente no array. 
    Utilize um loop para percorrer os elementos do array e identificar o maior valor. */
public class Exercicio6 {
    public static void main(String[] args) {
        int[] numeros = {5, 6, 1000, 7, 11, 1, 12};

        System.out.println(MaiorNumero(numeros));
    }

    public static int MaiorNumero(int[] numeros){
        int maior = numeros[1];

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior){
            maior = numeros[i];
            }
        }
        return maior;
    }
}
