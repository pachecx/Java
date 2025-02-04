package secao7;

/**
    > Exercício 1: Somatório com for

    Crie um programa que use um loop for para calcular 
    o somatório dos números de 1 a 100 e exiba o resultado.
    1 + 2 + 3... = x
    1 2 3 4 5 
 */

public class Exercicio1 {
    public static void main(String[] args) {
        int sun = 0;

        for(int i = 0; i <= 100; i++){
            
            sun += i;
         }

         System.out.println(sun);

    }

}
