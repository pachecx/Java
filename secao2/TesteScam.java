package secao2;
import java.util.Scanner;

public class TesteScam {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite seu nome: ");

        // String nome = scanner.nextLine();

        // System.out.println("Olá " + nome);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int numero = scanner.nextInt();
        System.out.println("O numero digitado é: " + numero + ".");

        scanner.close();
    }
    
}