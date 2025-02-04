package secao7;
/*
 *   > Exercício 2: Impressão de Números Pares com while

    Desenvolva um programa que use um loop while para imprimir 
    todos os números pares de 1 a 20.
    
 */
public class Exercico2 {
    public static void main(String[] args) {
      int num = 0;
      while (num <= 19) {
         num += 1;

         if(num % 2 == 0){
            System.out.println(num);
         }
      }
    }
}
