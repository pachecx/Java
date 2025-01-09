package secao4;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*   
        > Exercício 5: Verificação de Intervalo com AND

        Peça ao usuário para inserir um número. 
        Verifique se o número está no intervalo de 10 a 20, inclusive. 
        Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor !");
    
        int valor = scanner.nextInt();

        if(valor >= 10 && valor <= 20){
            System.out.println("Valor esta entre o intervalo!");
        } else{
            System.out.println("Valor não esta no intervalo!");
        }

        scanner.close();
    }
}
