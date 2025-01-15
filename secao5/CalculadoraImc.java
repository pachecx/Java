package secao5;
import java.util.Scanner;

// 1 - Pedir peso em kg
// 2 - Pedir altura em m
// 3 - Calcular IMC => peso / (altura * altura)
// 4 - Exibir classificação
// < 18.5 => Abaixo do peso
// >= 18.5 e <= 24.9 => Peso normal
// >= 25 e < 29.9 => Sobrepeso
// Mais que isso: obesidade

public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");

        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");

        double altura = scanner.nextDouble();

        double mediaImc = peso / (altura * altura);

        if(mediaImc < 18.5){
            System.out.println("Abaixo do peso");
        } else if(mediaImc >= 18 && mediaImc <= 24.9){
            System.out.println("Peso normal, Imc: " + mediaImc);
        } else if(mediaImc >= 25 && mediaImc < 29.9){
            System.out.println("Sobrepeso, Imc: " + mediaImc);
        } else{
            System.out.println("Obesidade, Imc igual a: " + mediaImc);
        }

        scanner.close();
    }
}
