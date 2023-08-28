import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String planoOperadora;
    
    //explicação sobre o plano da paia operadora ltda.    
    System.out.println("Olá bem vindo a operadora Paia\nSegue os nossos planos");
    System.err.println("plano A possui 2 GB de internet e whatsapp ilimitado\nPlano B possui 4 GB de internet e whatsapp e facebook ilimitados");


    //coleta o dado do plano escolhido pelo usuario
    System.out.println("Qual plano deseja adquirir");
    planoOperadora = input.nextLine();

    //vai coletar o dado digitado pelo teclado e tranformalo em letra maiscula pra entrar no caso se for digitado A ou B    
    switch (planoOperadora.toUpperCase()) {
        case "A":
            System.out.println("Plano A escolhido, seja bem vindo e Use bem a seu plano");
            break;
        case "B":
            System.out.println("Plano A escolhido, seja bem vindo e Use bem a seu plano");
        default:
        System.out.println("Oção inválida");
            break;

        }
        input.close();
}
    
}
