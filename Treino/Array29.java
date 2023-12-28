package Treino;

public class Array29 {
    public static void main(String[] args) {
               /*
* 29.Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
sendo este a junção dos dois outros vetores. Os primeiros 10
elementos de C deverão receber os elementos de A e os últimos
elementos C deverão receber os elementos de B. Desta forma, C
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
         */

         int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
         int[] vetorB = {11,12,13,14,15,16,17,18,19,20};
         int[] vetorC = new int[20];
 
         for(int i=0; i < 10; i++){
             vetorC[i] = vetorA[i];
             vetorC[i+10] = vetorB[i];// vai somar a posição i mais o valor 10, fazenddo com que cehgue possivel acessa os valores de 11 a dinate
         }
         System.out.println("Vetor C");
         for(int i= 0 ; i < vetorC.length; i++){
             System.out.print(vetorC[i]+"| ");
         }
    }
}
