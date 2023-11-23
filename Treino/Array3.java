package Treino;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] VetorA = new int[15];
        int[] VetorB = new int[VetorA.length];

        for(int i = 0; i < VetorA.length; i++){

            System.out.printf("Digite o valor que vai ser ocupado no indice %d: ", i);
            VetorA[i] = input.nextInt();// vai armazer o dado digitado pelo teclano no vetorA na posição I que vai tá de acordo com a iteração
            //System.out.println(VetorA[i]);// preciso fazer um for pra passar os vetores
            VetorB[i] = VetorA[i] * VetorA[i];
        }

        //imprimindo o vetorA
        for(int i = 0; i<VetorA.length; i++){
            System.out.println("VetorA\n"+VetorA[i]);
        }
        //imprimindo o vetorB
        for(int i = 0; i < VetorB.length; i++){
            System.out.println("VetorB\n"+VetorB[i]);
        }



        input.close();

    }
}
