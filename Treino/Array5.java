package Treino;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //multiplicar o valor do  vetor b pelo indice de posição

        int[] VetorA = new int[8];
        int[] VetorB = new int[VetorA.length];

        for(int i = 0; i < VetorA.length; i++){
            VetorA[i] = input.nextInt();
            VetorB[i] = VetorA[i] * i;
            
        }

        System.out.println("Vetor A");
        for(int i = 0; i < VetorA.length; i++){
            System.out.println(VetorA[i]+" ");

        }

        System.out.println("Vetor B");
        for(int i = 0; i < VetorB.length; i++){
            System.out.println(VetorB[i]+" ");

        }
        
        input.close();


    }


}
