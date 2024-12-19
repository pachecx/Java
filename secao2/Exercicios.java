package secao2;
public class Exercicios {
    public static void main(String[] args) {
                /*   
            EXERCÍCIO 1:

            Crie uma variável int para armazenar o valor 10. 
            Crie uma segunda variável int que armazene o dobro do valor da primeira variável
            usando operadores aritméticos. 
            Exiba o resultado.

            EXERCÍCIO 2:

            Declare uma variável char que armazene a letra 'B'. 
            Faça o casting explícito dessa variável para int e exiba o valor numérico correspondente.

            EXERCÍCIO 3:

            Declare duas variáveis double para armazenar os valores 15.75 e 20.40. 
            Some os valores dessas variáveis e armazene o resultado em uma nova variável double. 
            Exiba o resultado.

            EXERCÍCIO 4:

            Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000). 
            Em seguida, declare uma variável int e faça o casting explícito do valor long para int. 
            Exiba o resultado.

            EXERCÍCIO 5:

            Escreva um programa que crie uma variável String com o valor "Olá, Mundo!". 
            Em seguida, crie outra variável String que concatene a primeira variável com o texto 
            " Bem-vindo ao Java!". 
            Exiba o resultado.

        */

        //01
        int numeroUm = 10;
        int dobro = numeroUm + numeroUm; 
        System.out.println(dobro);

        //02
        char varChar = 'B';
        int numero = (int) varChar;
        System.err.println(numero);  
        
        //03
        double fracao1 = 15.75;
        double fracao2 = 20.40;
        double result = fracao1 + fracao2;
        System.out.println(result);

        //04
        long bi = 2_000_000_000L;
        int inteiro = (int) bi;
        System.out.println(inteiro);

        //05
        String ola = "Olá, Mundo!";
        String concat = ola + " Bem-vindo ao Java!";
        System.out.println(concat);
    }
}
