package seccao9;

public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome){
        if(nome != null && nome.length() > 3 && !nome.isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("Nome inváido!");
        }
    }

    public String getNome(){
        return "Nome do produto é: " + nome.toUpperCase();
    }

    public void getPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        }else{
            System.out.println("valor atualizado");
        }
    }
    
    //Metodo dentro do metodo

    public void aplicarDeconto(double porcentagem){
        if(porcentagem < 0 && porcentagem <= 100){
            double desconto = calcularDesconto(porcentagem);
            this.preco -= desconto;
            System.out.println("Desconto de " + porcentagem + "% aplicado!");

            System.out.println(this.getNome());
        }else{
            System.out.println("Porcentagem inválida!");
        }
    }

    private double calcularDesconto(double porcentagem){
        return ( this.preco * porcentagem ) / 100;
    }

}
