package Treino;

public class Array26 {
    public static void main(String[] args) {
        /*.Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
        um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
        regras de formação: a) C i deverá receber 1 quando A i for maior que B i;
        b) Ci deverá receber 0 quando Ai for igual a Bi; c) C i deverá receber -1
        quando A i for menor que Bi.
 */

        int[] vetorA = {12,87,7,45,6,12,4,8,14,32};
        int [] vetorB = {12,47,9,7,13,5,2,11,3,89}; 
        int[] vetorC = new int[vetorA.length];

        for(int i = 0 ; i < vetorA.length ; i++){
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            }
            else if(vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            }
            else if(vetorA[i] < vetorB[i]){
                vetorC[i] = -1;
            }

        }

        System.out.println("Vetor C valores");
        for(int i = 0; i<vetorC.length; i++){
            System.out.print(vetorC[i]+"| ");
        }
    }
}
