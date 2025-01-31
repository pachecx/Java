package secao7;

/**
    > Exercício 1: Somatório com for

    Crie um programa que use um loop for para calcular 
    o somatório dos números de 1 a 100 e exiba o resultado.
    1 + 2 + 3... = x
 */

public class Exercicio1 {
    public static void main(String[] args) {
        soma();
    }

    public static int soma(){
        for(int i = 1; i <= 10; i++){
           int sun =+ i;
            System.out.println(sun);
        }
                return 0;

       // return sun;
    }
}
