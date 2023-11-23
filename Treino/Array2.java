package Treino;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int[] VetorA = new int[8];
        int[] VetorB = new int[VetorA.length];

        for(int i = 0; i < VetorA.length; i++){
            System.out.printf("Digite um valor que vai corresponder ao indice %d: ",i);
            VetorA[i] = input.nextInt(); 
            VetorB[i] = VetorB[i] * 2;
            //VetorB = VetorA;  É o jeito errado de se fazer uma copia pois vai fazer que que o vetorB ocupe o msm lugar de memoria do vetorA
            //Isso faz com que o que eu mudasse no B afetaria também o  A
            //Já no exemplo usado acima eu estou fazendo uma copia dos elemntod do vetor A pro meu, fazendo assim com que eles não dividam
            //o mesmo local na memoria fazendo o B faça uma copia do A mas mexer nele não afetará o A
        }
        

        for(int i = 0; i < VetorB.length; i++){
            System.out.println(VetorB[i]);
        }


        input.close();

    }
}
