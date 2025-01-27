package secao6;

public class Funcoes2 {
    public static void main(String[] args) {
        System.out.println(verificar(20, true, false));
    }

    public static String verificar(int idade, boolean temCarteira, boolean temHistorico){
        
        if(idade >= 18 && temCarteira == true && temHistorico == false){
            return "Acesso permitido!";
        } else return "Acesso negado!";
    }

    
    /**
     * @param nota1 primeira nota
     * @param nota2 segunda nota
     * @param nota3 terceira nota
     * @return retorno da media
     */

    public static double media(int nota1, int nota2, int nota3){
        return (nota1 + nota2 + nota3) / 3;
    }
}
