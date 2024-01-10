package Treino;

public class Array36 {
    public static void main(String[] args) {
/*Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que
cada elemento do vetor A é formado pela potência de base 2 elevado
ao expoente igual a posição do respectivo elemento, ou seja:
A[i] = 2i
. Sugestão int A[11];
 */

        int[] vetorA = new int[11];

        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = (int)Math.pow(i, 2);// diz que eu vou querer que o valor de I seja elevado a segunda potencia
        }

        //imprimndo os resultados
        System.out.println("Vetor A com as potencias");
        for(int i=0; i<vetorA.length; i++){

            System.out.println("VetorA[" + i + "] = " + vetorA[i]);
        }


    }
}
