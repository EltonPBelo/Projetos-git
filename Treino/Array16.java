package Treino;

public class Array16 {

    public static void main(String[] args) {
        
        /*Criar um vetor A com 10 elementos inteiros. Escrever um programa
        que calcule e escreva: a) a soma de elementos armazenados neste
        vetor que são inferiores a 15; b) a quantidade de elementos
        armazenados no vetor que são iguais a 15; e c) a média dos
        elementos armazenados no vetor que são superiores a 15 */

        int[] vetorA = {7,5,4,23,15,34,15,4,33,45,15,11};
        int igual15 = 0;
        int somaMenor15 = 0;
        int mediaDosElementos = 0;
        int somaMaior15 = 0;
        int qrdMaior15 = 0;

        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] == 15) { 
                igual15++;
            }
           else if (vetorA[i] < 15) {
                somaMenor15 += vetorA[i];
            }
            else{
                qrdMaior15++;
                somaMaior15 += vetorA[i];
            }
        }
        System.out.println("Vetor A = ");
        for(int i =0; i < vetorA.length; i++){
        }
        System.out.println("Qtd números == 15: "+igual15+"  ");
        System.out.println("Qtd números > 15: "+somaMaior15+"  que possui uma média de "+ somaMaior15 / qrdMaior15);
        System.out.println("Qtd números < 15: "+somaMenor15+"  ");

}
}
