package secao4;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /* 
    > Exercício 6: Classificação de Letra

    Peça ao usuário para inserir uma letra. 
    Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante. 
    Exiba "Vogal" ou "Consoante" de acordo com a entrada. 
    Considere tanto letras maiúsculas quanto minúsculas. 
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verifique se a letra é vogal");

        String letra = scanner.nextLine();

       switch (letra) {
        case "a":
            System.out.println("Vogal");            
            break;

            case "A":
            System.out.println("Vogal");            
            break;
            
            case "e":
            System.out.println("Vogal");            
            break;

            case "E":
            System.out.println("Vogal");            
            break;

            case "i":
            System.out.println("Vogal");            
            break;

            case "I":
            System.out.println("Vogal");            
            break;

            case "o":
            System.out.println("Vogal");            
            break;

            case "O":
            System.out.println("Vogal");            
            break;

            case "u":
            System.out.println("Vogal");            
            break;

            case "U":
            System.out.println("Vogal");            
            break;
       
        default:
            System.out.println("Consoante");            
            break;
       }

        scanner.close();
    }
}
