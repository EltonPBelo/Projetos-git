package Treino;

public class Array12 {
    public static void main(String[] args) {
        
        int[] VetorA = {1,1,1,1,1};
        int soma = 0;
        // precciso de um inteireo para armazenar a soma
        for(int i = 0; i < VetorA.length; i++){
            soma += VetorA[i]; /*Aqui eu estou dizendo que o elemento do array vetorA  vai ser atribuido  a variavel soma,
             que no primeiro caso ela
            e zero e sera somado com o valor 1 do array, logo passará a ser um, no loop seguinte o velor do Vetor A é 1 tambem, logo o valor 1 da variavél
            soma será somado e atribuido fazendo com que o valor seja 2*/
            System.out.println(soma);
        }
            
            
    }
}
