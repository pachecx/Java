package secao4;
import java.util.Scanner;

/*
 > Exercício 2: Validação de Login

    Peça ao usuário para inserir um nome de usuário e uma senha. 
    Verifique se o nome de usuário é "admin" e a senha é "1234". 
    Se ambos forem corretos, exiba "Acesso permitido". 
    Caso contrário, exiba "Acesso negado".
 */

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu Email:");

        String login = scanner.nextLine();
        
        System.out.println("Qual a senha?");

        int senha = scanner.nextInt();

        if(login.equals("admin")&& senha == 1234){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        scanner.close();
    }
}
