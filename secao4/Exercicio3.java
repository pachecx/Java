package secao4;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
          > Exercício 3: Identificação de Paridade com Strings

            Peça ao usuário para inserir um número. 
            Verifique se o número é par ou ímpar, e exiba a palavra
             "Par" ou "Ímpar". 
            Use uma string para armazenar o resultado e exibi-la.

            Depois de avaliar o número, tu vai colocar se é par ou impar 
            em uma var.
            
         */

         Scanner scanner = new Scanner(System.in);

         System.out.println("Insira uma numero para verificar se é Par ou Impar");

         int parImpa = scanner.nextInt();

         if(parImpa % 2 == 0){
            System.out.println("Par");
         } else{
            System.out.println("Ímpar");
            
         }

         scanner.close();
    }
}
