package Calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
    Scanner entradaDados = new Scanner(System.in);

        Double num1,num2,resultado;
        char operador;
        String confirmacao;

        System.out.print("Digite o primeiro valor: ");
        num1 = entradaDados.nextDouble();

        System.out.print("Digite o segundo valor: ");
        num2 = entradaDados.nextDouble();

        System.out.print("Digite o tipo da operação");
        operador = entradaDados.next().charAt(0);// vai pegar o valor do indice 0, os demais indices serão ignorado

       System.out.println("Deseja obter o resultado da operação com duas casas decimais após a virgula? (Responda com 'Sim' ou 'não'): ");
        confirmacao = entradaDados.next();

        if(confirmacao.equalsIgnoreCase("Sim")){

            switch(operador){
                case '+':
                resultado = num1 + num2;
                System.out.printf("O Resultado da soma é %.2f",resultado);
                break;

                case '-' :
                resultado = num1 - num2;
                System.out.printf("O Resultado da subtração é %.2f",resultado);
                break;

                case '*':
                resultado = num1 * num2;
                System.out.printf("O Resultado da multiplicação é %.2f",resultado);
                break;

                case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("O Resultado da soma é %.2f",resultado);
                    break;
                }
                else{
                    System.out.println("ERROR tentativa de divisão por zero (0)");
                }

                default: System.out.println("Valor incorreto inserido");


            }

        }

        else if(confirmacao.equalsIgnoreCase("não") || confirmacao.equalsIgnoreCase("nao")) {
            switch(operador){
                case '+':
                resultado = num1 + num2;
                System.out.println("O Resultado da soma é "+resultado);
                break;

                case '-' :
                resultado = num1 - num2;
                System.out.println("O Resultado da subtração é "+resultado);
                break;

                case '*':
                resultado = num1 * num2;
                System.out.println("O Resultado da multiplicação é "+resultado);
                break;

                case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O Resultado da soma é "+resultado);
                    break;
                }
                else{
                    System.out.println("ERROR tentativa de divisão por zero (0)");
                }

                default: System.out.println("Valor incorreto inserido");


            }

        }
        System.out.println("\nPrograma encerrado.......");
        entradaDados.close();
}
}
