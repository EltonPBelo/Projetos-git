package Treino;

public class ForEach05 {
    public static void main(String[] args) {
        
 
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] vetorB = new int[20];
        int[] vetorC = new int[20];

        //variaveis flag para armazenar valores
        int indiceB = 0;// vai armazenar o valor par do vetor A
        int indiceC = 0;// vai armazenar o valor impar do vetor A

        for(int vetors : vetorA){
            if(vetors % 2 == 0){
                vetorB[indiceB] = vetors;//Faz com que eu armazena o valor impar do vetor A na variavel indiceB, que agora irá pertencer a
                //espaço no Array do vetorC
                indiceB++;// vai servir pra pular de uma casa para a outra pra poder repitir o processo acima
            }

            else if(vetors % 2 != 0){
                vetorC[indiceC] = vetors; //Faz com que eu armazena o valor impar do vetor A na variavel indice C, que agora irá pertencer a
                //espaço no Array do vetorC
                indiceC++;// vai servir pra pular de uma casa para a outra pra poder repitir o processo acima(faz com que o indice C se torne uma posição iteravel)
                //já que o mesmo esta dentro de uma lista(ou seja vai receber e armazenar na lista e iterar)

            }
            //impressão dos valores
        }
        System.out.println("\nVetor A");
         for(int vetora : vetorA){
            System.out.print(vetora +"| ");
         }
        System.out.println("\nVetor B");
         for(int vetorb : vetorB){//faz com que a iteração pare e mostre as casas vazias, pois o contador não foi usado como referencia pra ele parar ao acabar os valores, fazendo com que mostre valores 0 para preencher o array
            System.out.print(vetorb +"| ");
         }
        System.out.println("\nVetor C");
         for(int vetorc : vetorC){//  i<vetorA.length vai até o final da iteração e mostra as casa vazias
            System.out.print(vetorc +"| ");
         }
    }
}
