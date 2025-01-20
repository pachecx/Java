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
}
