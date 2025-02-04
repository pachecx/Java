package secao7;
/* > Exercício 3: Verificação de Número Primo com for

    Escreva um programa que receba um número do usuário 
    e use um loop for para verificar se ele é primo.
     */
public class Exercicio3 {
    public static void main(String[] args) {
        int numPrimo = 23;

        boolean ePrimo = true;

        // testar se ele é primo mesmo
        for(int i = 2; i < numPrimo; i++) {

            // dividir esse cara e não ter resto, ele não é primo
            // 1 e por ele mesmo
            if(numPrimo % i == 0) {
                ePrimo = false;
                break;
            }

        }

        if(ePrimo) {
            System.out.println("O numero " + numPrimo + " é primo!");
        } else {
            System.out.println("O numero " + numPrimo + " NÃO é primo!");
        }
    }

    
}
