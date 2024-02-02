package Treino;

import java.util.Scanner;

public class ForEach03 {
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
        for(int vetora  : VetorA){
            System.out.println(vetora+" ");

        }

        System.out.println("Vetor B");
        for(int vetorb : VetorB){
            System.out.println(vetorb+" ");

        }
        
        input.close();

    }
}
