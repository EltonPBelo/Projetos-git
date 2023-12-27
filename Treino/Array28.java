package Treino;

public class Array28 {
    public static void main(String[] args) {
/*28.Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante */

int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
int[] vetorB = {1,2,3,4,5,6,7,8,9,10};

System.out.println("Vetor A");
for(int i=0; i<vetorA.length; i++){
    System.out.print(vetorA[i]+"| ");
}
System.out.println("Vetor B");
for(int i = vetorB.length-1; i>=0; i--){
    System.out.print(vetorB[i]+"| ");
}


    }
}
