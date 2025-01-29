package secao6;
/*  > Exercício 3: Função com if-else para Verificar Paridade

    Crie uma função que receba um número inteiro 
    e retorne uma string indicando se o número é "Par" ou "Ímpar". 
    Use condicionais if-else para determinar a paridade.
     */
public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println(ParImpa(1012));
    }

    public static String ParImpa(int n){
        String result = "";
        if(n % 2 == 0){
         result = "PAR";
        } else{
         result = "IMPA";
        }
            return result;
    }
}
