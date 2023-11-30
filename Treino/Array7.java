package Treino;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int[] VetorA = new int[5];
        int[] VetorB = new int[VetorA.length];
        int[] VetorC = new int[VetorA.length];

        System.out.println("Vetor A coleta de dados");
        for(int i = 0; i < VetorA.length; i++){
        System.out.printf("Digite o valor do indice %d: ", i);
        VetorA[i] = input.nextInt();
    }
    
    System.out.println("Coleta de dados Vetor B");
    for(int i = 0; i < VetorB.length; i++){
            System.out.printf("Digite o valor do indice %d: ", i);
            VetorB[i] = input.nextInt();
        }
        System.out.println("Vetor C");
        for(int i = 0; i < VetorC.length; i++){
        System.out.println(VetorC[i]);
        VetorC[i] = VetorA[i]-VetorB[i];// Posição I do meu vetor c vi ser igual a posição i do vetor a - a i do vetor b
        /*
        * Nao importa quantas msg ou a posição desse bloco
          VetorC[i] = VetorA[i]-VetorB[i];// Posição I do meu vetor c vi ser igual a posição i do vetor a - a i do vetor b
          se ele estiver no meu for dentro do bloco ele vai ser iterado de um em um na suas casas pois é o valor de I vai fazer as iterações
         */
    }
       


        input.close();
    }
}
