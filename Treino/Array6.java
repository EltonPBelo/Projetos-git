package Treino;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] VetorA = new int[5];
        int[] VetorB = new int[VetorA.length];
        int[] VetorC = new int[VetorA.length];

        System.out.println("Coleta De dados Vetor A");

        for(int i = 0; i < VetorA.length; i++){
            //coleta de dados feita pelo teclado
            System.out.printf("Digite o valor que vai ocupar a posição %d: ",i);
            VetorA[i] = input.nextInt();
           // System.out.println(VetorA);
        }
        
        System.out.println("Coleta de dados do Vetor B");
        
        for(int i = 0; i < VetorB.length; i++){
            //coleta de dados feita pelo teclado
            System.out.printf("Digite o valor que vai ocupar a posição %d: ",i);
            VetorB[i] = input.nextInt();
          // System.out.println(VetorB);

            VetorC[i] = VetorA[i] + VetorB[i]; 
        }

        System.out.println("Vetor C");
        for(int i = 0; i<VetorA.length; i++){
            System.out.println(VetorC[i]);
        }

        input.close();
    }
}
