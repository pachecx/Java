package secao3;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para saber a tabuada de multiplicação!");
        
        int numero = scanner.nextInt();

        System.out.println(numero + " * 1 = " + (1 * numero));
        System.out.println(numero + " * 2 = " + (2 * numero));
        System.out.println(numero + " * 3 = " + (3 * numero));
        System.out.println(numero + " * 4 = " + (4 * numero));
        System.out.println(numero + " * 5 = " + (5 * numero));
        System.out.println(numero + " * 6 = " + (6 * numero));
        System.out.println(numero + " * 7 = " + (7 * numero));
        System.out.println(numero + " * 8 = " + (8 * numero));
        System.out.println(numero + " * 9 = " + (9 * numero));
        System.out.println(numero + " * 10 = " + (10 * numero));

        scanner.close();
    }
}
