package secao7;
/*
    > Exercício 6: Contagem de Dígitos de um Número com while

    Crie um programa que conte quantos dígitos há em um número inteiro positivo 
    usando um loop while.

    1000 = 4 digitos
 */
public class Exercicio6 {
    public static void main(String[] args) {
        
        int numeroParaContar = 48484848;

        int contador = 0;

        while(numeroParaContar != 0) {

            numeroParaContar = numeroParaContar / 10;

            System.out.println(numeroParaContar);

            contador++;
        }

        System.out.println("Numero de dígitos: " + contador);

    
    }
}
