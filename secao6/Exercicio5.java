package secao6;
/*  > Exercício 5: Função com System.exit para Verificar Idade

    Crie uma função que receba a idade de uma pessoa. 
    Se a idade for menor que 18, use System.exit(0) 
    para encerrar o programa com uma mensagem de "Acesso negado". 
    Caso contrário, exiba "Acesso permitido".
     */
public class Exercicio5 {
    public static void main(String[] args) {
        verificacao(5 );
    }

    public static int verificacao(int idade){
        
        if(idade <= 18){
            System.out.println("Acesso negado!");
            System.exit(0);
        }else{
            System.err.println("Acesso permitido!");
        }
        return idade;
    }
}
