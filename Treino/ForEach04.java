package Treino;

public class ForEach04 {
    public static void main(String[] args) {
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
         int[] vetorB = {11,12,13,14,15,16,17,18,19,20};
         int[] vetorC = new int[20];
 
         for(int i=0; i < 10; i++){
             vetorC[i] = vetorA[i];
             vetorC[i+10] = vetorB[i];// vai somar a posição i mais o valor 10, fazenddo com que cehgue possivel acessa os valores de 10 a dinate
         }
         System.out.println("Vetor C");

         for(int vetorc : vetorC){
             System.out.print(vetorc+"| ");
         }
    }
}
