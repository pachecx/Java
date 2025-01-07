package secao4;

import java.util.Scanner;

/*
    > Exercício 1: Verificação de Categoria de Preço

    Peça ao usuário para inserir o preço de um produto. 
    Se o preço for menor que 50, categorize-o como "Barato". 
    Se estiver entre 50 e 100, categorize como "Médio". 
    Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente.
    
   
    > Exercício 4: Identificação de Dia Útil

    Peça ao usuário para inserir um número de 1 a 7, 
    representando os dias da semana (1 para domingo, 2 para segunda, etc.). 
    Use switch para verificar se o dia é um dia útil (segunda a sexta) 
    ou final de semana (sábado e domingo). 
    Exiba uma mensagem correspondente.
    
    > Exercício 5: Verificação de Intervalo com AND

    Peça ao usuário para inserir um número. 
    Verifique se o número está no intervalo de 10 a 20, inclusive. 
    Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".
    
    > Exercício 6: Classificação de Letra

    Peça ao usuário para inserir uma letra. 
    Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante. 
    Exiba "Vogal" ou "Consoante" de acordo com a entrada. 
    Considere tanto letras maiúsculas quanto minúsculas. 

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