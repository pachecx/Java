package secao7;
/* > Exercício 5: Fatorial de um Número com for

    Desenvolva um programa que calcule o 
    fatorial de um número inteiro positivo usando um loop for.

    5 * 4 * 3 * 2 * 1

    1 * 2 * 3 * 4 * 5
     */
public class Exercicio5 {
    public static void main(String[] args) {
        int numFatorial = 12;
        int fatorial = 1;

        for(int i = 1; i <= numFatorial; i++) {

            fatorial *= i;

        }

        System.out.println("O fatorial de " + numFatorial + " é igual a " + fatorial);

    }
}
