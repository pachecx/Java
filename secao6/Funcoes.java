package secao6;

public class Funcoes {
    public static void main(String[] args) {
        saudacao();
        soma(6, 10);
    }

    // nivel de acesso, static
    public static void saudacao() {
        System.out.println("ola da funcao");
    }

    public static void soma( int a, int b){
        int result = a + b;
        System.out.println(" A soma é: " + result);
    }

}
