package secao6;
/*
    > Exercício 1: Função para Converter Temperatura

    Crie uma função que converta uma temperatura de Celsius para Fahrenheit. 
    A função deve receber a temperatura em Celsius como argumento 
    e retornar o valor correspondente em Fahrenheit. 
    Exiba o resultado encapsulado em uma variável.
*/

public class Exercicio {
    public static void main(String[] args) {
     
        System.out.println("Resultado: " + Converter(25));
    }

    public static double Converter(double c){
        return (c * 1.8) + 32;
    };
}