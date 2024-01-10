package Treino;

public class Array33 {
    public static void main(String[] args) {
        
/*33.Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e uma mensagem indicando se o
respectivo elemento é um número primo ou não */


   
        int[] vetorA = {2, 5, 8, 3, 10, 6, 7, 12, 15, 9};

        System.out.println("Elementos do vetor A e seus pares:");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Elemento " + vetorA[i] + ":");

            // Imprime todos os pares de 0 até o elemento atual
            for (int j = 0; j <= vetorA[i]; j += 2) { // vai imprimir os numeros de 2 em 2 até chegar no valor i, se o numero for par ele vai imprimir
                // todos os elementos pares até o I,  e se for impar irá imprimir todos menos o valor I que é impár
                System.out.print(j + " ");
            }

            System.out.println(); // Adiciona uma linha em branco para separar os resultados
        }
    


        

    }
}
