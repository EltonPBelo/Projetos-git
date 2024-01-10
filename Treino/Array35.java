package Treino;

public class Array35 {
    public static void main(String[] args) {
        int[] vetorA = { 1, 2, 5, 8, 3, 10, 6, 7, 12, 15, 9};

        System.out.println("Elementos do vetor A e seus divisores:");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("divisores do elemento " + vetorA[i] + ":");

            // Imprime todos os pares de 0 até o elemento atual
            for (int j = 2; j <= vetorA[i]; j++) {
                if(vetorA[i] % j ==0){ 
                System.out.print(j + "  ");
            }
        }

            System.out.println(); // Adiciona uma linha em branco para separar os resultados
        }
    }
}
