package secao4;

public class Switch {
    public static void main(String[] args) {
        int diaSemana = 15;

        switch(diaSemana){
            case 1:
                System.out.println("Segunda!");
                break;
           case 2:
                System.out.println("Terça!");
               break;
           case 3:
               System.out.println("Quarta!");
               break;
            case 4:
               System.out.println("Quinta!");
               break;
            case 5:
               System.out.println("Sextou!");
               break;

            default:
                System.out.println("Dia da semana não encontrado!");
            break;
       };
    }
}
