package secao8;
/**
 * 
    > Exercício 1: Inverter Elementos de um Array

    Crie um programa que receba um array de inteiros do usuário 
    e inverta a ordem dos elementos. 
    Exiba o array original e o array invertido.

    [1, 2, 3]
    [3, 2, 1]
*/
public class Exercicio {
    public static void main(String[] args) {
        int[] array = {1, 20, 3};

        int[] arrayInvertido = array;
        
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("Forma invertida :");

        for(int j = array.length - 1; j >= 0; j--){
            System.out.println( arrayInvertido[j]);
        }
    }
}
