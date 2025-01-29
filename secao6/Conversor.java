package secao6;
import java.util.Scanner;

/**
 * Objetivo: Criar um conversor de Celsius para Fahrenheit e de Fahrenheit para Celsius
 * 
 * Etapas do projeto
 * 
 * 1 - Obter do usuário se ele quer conveter Celsius ou Fahrenheit
 * 2 - Criar duas funções, uma para cada conversão
 * 3 - Obter a temperatura em cada uma das funções escolhidas
 * 4 - Exibir uma mensagem com a temperatura, ex: De x C para y F
 */

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite c para converter para f: ");

        String conversao = scanner.nextLine();

        if(conversao != "F" || conversao != "C"){
            System.out.println("Valor invalido");
            System.exit(0);
        }else if(conversao == "F"){
            System.out.println("Convertendo de F para C");

        }else if(conversao == "C"){
            System.out.println("Convertendo de c para f");
        }
      
        System.out.println(conversao );

        scanner.close();
    }
}
