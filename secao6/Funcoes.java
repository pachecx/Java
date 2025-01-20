package secao6;

public class Funcoes {
    public static void main(String[] args) {
        saudacao();
        soma(6, 10);

        int numeroDobrado = dobrar(10);
        System.out.println("O numero dobrado é: " + numeroDobrado);
    }

    // nivel de acesso, static
    public static void saudacao() {
        System.out.println("ola da funcao");
    }

    public static void soma( int a, int b){
        int result = a + b;
        System.out.println(" A soma é: " + result);
    }

    public static int dobrar(int n) {
        return n * 2 ;
    }

}
