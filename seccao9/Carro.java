package seccao9;

public class Carro {
        //atributos ou propriedades
        String marca;
        String modelo;
        int ano;

        double velocidadeAtual;
        boolean motorLigado = false;

        //metodos
        void acelerar(){
            System.out.println("Acelerando!!");
        };

        void exibirInfo(){
            System.out.println("Marca:" + marca + ", Modelo : " + modelo + ", Ano: " + ano);
        };

        void ligarMotor(){
            if(!motorLigado){
                motorLigado = true;
                System.out.println("Lingando motor....");
            }else{
                System.out.println("Motor ja esta ligado!!");
            }
        }

        void aumentarVelocidade(double incremento){
            if(motorLigado){
                velocidadeAtual += incremento;
                System.out.println("Velocidade atual é :" + velocidadeAtual);

            }else{
                System.out.println("Primeiro precisa ligar o carro");
            }
        }
}
