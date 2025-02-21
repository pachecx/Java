package seccao9;

public class POO {
    public static void main(String[] args) {
        // 1-criar classe
        //criação de carro.java

        //2 - instaciar a classe
        
        Carro fusca = new Carro();

        fusca.marca = "Vw";
        fusca.modelo = "Fusca";
        fusca.ano = 1964;

        fusca.acelerar();
        fusca.exibirInfo();

        Carro carro2 = new Carro();

        carro2.marca = "Fiat";
        carro2.modelo = "Estrada";
        carro2.ano = 2000;

        carro2.exibirInfo();

        fusca.aumentarVelocidade(10);

        fusca.ligarMotor();
        fusca.aumentarVelocidade(10);
        fusca.aumentarVelocidade(20);


        //4 Criando propriedades
        Pessoa joao = new Pessoa();
        joao.setNome("João");
        joao.setIdade(30);

        System.out.println("O nome do individuo é : " + joao.getNome());

        System.out.println("A idade do meliante é: " + joao.getIdade());
    }
    
}
