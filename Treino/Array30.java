package Treino;

public class Array30 {
    public static void main(String[] args) {

/*.Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
que nos vetor B e C serão armazenados o valores pares e ímpares de
A, respectivamente. */
        
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] vetorB = new int[20];
        int[] vetorC = new int[20];

        //variaveis flag para armazenar valores
        int indiceB = 0;// vai armazenar o valor par do vetor A
        int indiceC = 0;// vai armazenar o valor impar do vetor A

        for(int i = 0 ; i<vetorA.length ; i++){
            if(vetorA[i] % 2 == 0){
                vetorB[indiceB] = vetorA[i];//Faz com que eu armazena o valor impar do vetor A na variavel indiceB, que agora irá pertencer a
                //espaço no Array do vetorC
                indiceB++;// vai servir pra pular de uma casa para a outra pra poder repitir o processo acima
            }

            else if(vetorA[i] % 2 != 0){
                vetorC[indiceC] = vetorA[i]; //Faz com que eu armazena o valor impar do vetor A na variavel indice C, que agora irá pertencer a
                //espaço no Array do vetorC
                indiceC++;// vai servir pra pular de uma casa para a outra pra poder repitir o processo acima(faz com que o indice C se torne uma posição iteravel)
                //já que o mesmo esta dentro de uma lista(ou seja vai receber e armazenar na lista e iterar)

            }
            //impressão dos valores
        }
        System.out.println("\nVetor A");
         for(int i = 0 ; i<vetorA.length ; i++){
            System.out.print(vetorA[i] +"| ");
         }
        System.out.println("\nVetor B");
         for(int i = 0 ; i<indiceB ; i++){
            System.out.print(vetorB[i] +"| ");
         }
        System.out.println("\nVetor C");
         for(int i = 0 ; i<vetorA.length ; i++){
            System.out.print(vetorC[i] +"| ");
         }
    }
}


/*EXPLICAÇÃO DO chatGPT

 Seu código faz exatamente o que você descreveu nos comentários.
 Ele cria dois vetores, vetorB e vetorC, para armazenar os valores pares e ímpares do vetor vetorA, respectivamente. 
 Em seguida, ele percorre o vetor vetorA, verifica se cada elemento é par ou ímpar e os armazena nos vetores vetorB e vetorC de acordo.
  Finalmente, ele imprime os três vetores */