package Treino;

public class Array34 {
    public static void main(String[] args) {
        
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Elementos do vetor A e seus pares:");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Elemento " + vetorA[i] + ":");

            // Imprime todos os pares de 0 até o elemento atual
            for (int j = 2; j <= vetorA[i]; j++) {//vai começar já pelo número 2, ou seja se pegar o número 5 por exemplo o resultado será esse
                //( 2, 4) pois 2 e 4 são os numeros pares que antecedem o 5 que é um valor ímpar
                if(j % 2 == 0){ 
                System.out.print(j + " ");

                // vai imprimir os numeros de 2 em 2 até chegar no valor i, se o numero for par ele vai imprimir
                // todos os elementos pares até o I,  e se for impar irá imprimir todos menos o valor I que é impár
            }
        }

            System.out.println(); // Adiciona uma linha em branco para separar os resultados
        }
    }
}
