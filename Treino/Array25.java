package Treino;

import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        /*.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
        a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0
        quando Ai for ímpar */

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){

            System.out.println("Digite um valor: ");
            vetorA[i] = input.nextInt();

                if(vetorA[i] % 2 == 0){
                    vetorB[i] = 1;
                }
                else{
                    vetorB[i] = 0;
                }
        }
        System.out.println("Vetor B");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }

    }
}
