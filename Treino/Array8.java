package Treino;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] VetorA = new int[5];
        int[] VetorB = new int[VetorA.length];
        int[] VetorC = new int[VetorA.length];

        System.out.println("Coleta de dados do Vetor A");
        for(int i = 0; i < VetorA.length; i++){
            System.out.printf("Digite o valor do indice %d: ", i);
            VetorA[i] = input.nextInt();
        }
            
        System.out.println("Coleta de dados Vetor B");
        for(int i = 0; i<VetorB.length; i++){
            System.out.printf("Digite o valor do indice %d: ", i);
            VetorB[i] = input.nextInt();
        }

        System.out.println("Vetor C resultado");
        for(int i = 0; i<VetorC.length; i++){
            VetorC[i] = VetorA[i] * VetorB[i];
            System.out.println(VetorC[i]);
        }

                


        input.close();
    }
}
