package secao6;
/* > Exercício 4: Função com switch para Classificar Notas

    Crie uma função que receba uma nota de 0 a 10

    10 e 9: A, 8: B, 7: C, 6: D, restante F

    e retorne uma classificação de letra (A, B, C, D, F) usando um switch. 
    Inclua uma verificação para garantir que a nota está dentro do intervalo válido.
     */
public class Exercicio4 {
    public static void main(String[] args) {
        NotaMedia(800);
        NotaMedia(7);
        NotaMedia(9);
    }

    public static int NotaMedia(int nota){
        int notaFinal = nota;

        switch (notaFinal) {
            case 1: 
                System.out.println("F");
                break;

            case 2: 
                System.out.println("F");
                break;

            case 3: 
                System.out.println("F");
                break;

            case 4: 
                System.out.println("F");
                break;

            case 5: 
                System.out.println("F");
                break;

            case 6: 
                System.out.println("D");
                break;

            case 7: 
                System.out.println("C");
                break;

            case 8: 
                System.out.println("B");
                break;

            case 9: 
                System.out.println("A");
                break;

            case 10: 
                System.out.println("A");
                break;

            default:
                System.out.println("Insira uma nota valida!");
                break;
        }        
        return notaFinal;
    };
}
