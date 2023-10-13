package classesEstudos;

import java.util.Scanner;

public class BancoTeste {
    public static void main(String[] args) {


        //tentaar usar o Do nesse código

        Scanner input = new Scanner(System.in);

    Banco Bradesco = new Banco();

    System.out.print("Olá bem vindo ao Bradesco, diga o seu nome: ");
    Bradesco.nome = input.nextLine();
    System.out.println("Bem vindo a agência : "+Bradesco.nome);

    System.out.println("----------------------------------------------");

    
    //Sacar dinheiro
    System.out.printf("Qual o valor voçê deseja  sacar, lembrando que voçê possui %.2f R$ de saldo",Bradesco.saldo);
    System.out.print("Digite o valor a ser sacado: ");
    String valorSaqueString = input.nextLine().replace(",",".");//caso o user digite uma virgula ao invés do ponto o programa faz a conversão
    Double valorSaque = Double.parseDouble(valorSaqueString);
    Double saldoTotal = Bradesco.saldo - valorSaque;

    System.out.printf("Seu saldo após o saque: %.2f",saldoTotal);
    


        input.close();
    }
    
}
