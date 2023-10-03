package classesEstudos;

import java.util.Scanner;

public class TesteData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Data Calendario = new Data();
        Calendario.dia = input.nextInt();
        Calendario.mes = input.nextLine();
        Calendario.ano = input.nextInt();
        
        System.out.println();
        System.out.println();
        System.out.println();
       
    }
}
