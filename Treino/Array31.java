package Treino;

public class Array31 {
 public static void main(String[] args) {
    
    /*
Ler um vetor A com 20 elementos. Separar os elementos pares e
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
do vetor B armazene os elementos pares de A e nas posições
restantes do vetor B armazene os elementos de A que são ímpares.

     */

    int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int[] vetorB = new int[vetorA.length];

    int indiceParesB = 0;// vai servir como um indice extra para a iteração vo vetorB pares
    int indiceImparesB = vetorA.length / 2;

    for(int i = 0; i < vetorA.length; i++){

        if(vetorA[i] % 2 == 0){

            vetorB[indiceParesB] = vetorA[i];
            indiceParesB++;
        }
    }
        
        for(int i = 0; i < vetorA.length; i++){
        if(vetorA[i] % 2 != 0){

            vetorB[indiceImparesB] = vetorA[i];
            indiceImparesB  ++;

        }
}



System.out.println("\nVetor A");
for(int i = 0 ; i<vetorA.length ; i++){
   System.out.print(vetorA[i] +"| ");
}
System.out.println("\nVetor B");
for(int i = 0 ; i<indiceImparesB; i++){
   System.out.print(vetorB[i] +"| ");
}

}
}