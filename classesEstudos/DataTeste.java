package classesEstudos;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Data Calendario = new Data();

        System.out.println("Digite o dia: ");
        Calendario.dia = input.nextInt();
        input.nextLine();//input vazio pra nao dar erro de new line consuming(que vai ignorar o meu input String mes e vai direto pro ano)

        System.out.println("Digite o mês no formato de número: ");
        Calendario.mes = input.nextLine();

        System.out.println("Digite o ano: ");
        Calendario.ano = input.nextInt();
        
        System.out.println(Calendario.obterDataFormatda());
        System.out.println(Calendario.obterDataFormatada2());

        input.close();
       
    }
}
