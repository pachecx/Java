package secao6;
/* > Exercício 2: Função para Calcular o Fatorial de um Número

    Crie uma função que calcule o fatorial de um número inteiro. 
    Teste a função com um número de sua escolha.
     */
public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("O fatorial é: " + Fatorial(5));
    }

    public static int Fatorial(int numero){
        if(numero == 0 || numero == 1){
            return 1;
        }else{
            return numero * Fatorial(numero - 1);
        }
    }
}
