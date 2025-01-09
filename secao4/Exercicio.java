package secao4;

import java.util.Scanner;

/*
    > Exercício 1: Verificação de Categoria de Preço

    Peça ao usuário para inserir o preço de um produto. 
    Se o preço for menor que 50, categorize-o como "Barato". 
    Se estiver entre 50 e 100, categorize como "Médio". 
    Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente.
    */

public class Exercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        
        int valor = scanner.nextInt();

     if(valor < 50){
        System.out.println("Barato");
     } else if(valor <= 100){
        System.out.println("Médio");
     }else{
        System.out.println("Caro");
     }

        scanner.close();
    }
}