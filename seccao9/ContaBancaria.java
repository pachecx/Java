package seccao9;

public class ContaBancaria {
    private String titular;
    private double saldo;  
    
    public void setTitular(String titular) {
        if(titular != null && !titular.isEmpty()){
            this.titular = titular;
        }else{
            System.out.println("NOme do titular invalido");
        }      
    }

    public void setSaldo(double saldo){
        if(saldo > 0){
            this.saldo = saldo;
        }else{
            System.out.println("Valor invalido, precisar ser superior a zero");
        }
    }

    public void getInfo(){
        System.out.println("Nome: " + titular + ", Saldo: " + saldo);
    }

    public String getSaldo(){
        return "R$" + saldo;
    }
}
