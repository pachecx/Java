package secao7;
/* > Exercício 4: Menu Interativo com do-while

    Crie um programa que exiba um menu interativo usando do-while, 
    permitindo ao usuário escolher opções até que ele decida sair.

    // menu de opcoes com print: 1) comida 2) bebida
    // um numero aleatorio que mediante a ser X, pare o loop
     */
public class Exercicio4 {
    public static void main(String[] args) {
        int opcao;

        do {

            System.out.println("Exercício 4 - Menu");
            System.out.println("0) Refrigerante");
            System.out.println("1) Hamburger");
            System.out.println("2) Cachorro quente");
            System.out.println("3) Sushi");
            System.out.println("4) Sair");

            opcao = (int)(Math.random() * 5);

            System.out.println("A opção escolhida foi: " + opcao);

        } while(opcao != 4);

    }
}
