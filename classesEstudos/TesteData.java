package classesEstudos;

import java.util.Scanner;

public class TesteData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Data Calendario = new Data();
        Calendario.dia = input.nextInt();
        input.nextLine();//input vazio pra nao dar erro de new line consuming(que vai ignorar o meu input String mes e vai direto pro ano)
        System.out.println("--------------------------------------");
        Calendario.mes = input.nextLine();
        Calendario.ano = input.nextInt();
        
        System.out.println("Dia: "+ Calendario.dia);
        System.out.println("Do mês de: "+Calendario.mes);
        System.out.println("Do ano de : "+Calendario.ano);

        input.close();
       
    }
}
