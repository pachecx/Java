package secao4;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
          > Exercício 4: Identificação de Dia Útil

            Peça ao usuário para inserir um número de 1 a 7, 
            representando os dias da semana (1 para domingo, 2 para segunda, etc.). 
            Use switch para verificar se o dia é um dia útil (segunda a sexta) 
            ou final de semana (sábado e domingo). 
            Exiba uma mensagem correspondente.
         */

         Scanner scanner = new Scanner(System.in);
         System.out.println("Insira um numero de 1 a 7");

         int semana = scanner.nextInt();

         switch (semana) {
            case 1:
                System.out.println("Final de semana 'Domingo' ");
                break;
            case 2:
                System.out.println("Dia útil 'Segunda' ");
                break;
            case 3:
                System.out.println("Dia útil 'Terça' ");
                break;
            case 4:
                System.out.println("Dia útil 'Quarta' ");
                break;
            case 5:
                System.out.println("Dia útil 'Quinta' ");
                break;
            case 6:
                System.out.println("Dia útil 'Sexta' ");
                break;
            case 7:
                System.out.println("Final de semana 'Sabado' ");
                break;
            default:
            System.out.println("NUmero invalido, apenas de 1 a7 ");
                break;
         }

         scanner.close();
    }
}
