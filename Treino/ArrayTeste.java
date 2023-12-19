package Treino;

public class ArrayTeste {
    public static void main(String[] args) {
        
                int[] vetorA = {1, 2, 3, 4, 5};
        
                for (int i = 0; i < vetorA.length; i++) {
                    // Elemento atual
                    int elementoAtual = vetorA[i];
                    
                    // Elemento simétrico em relação ao final do vetor
                    int elementoSimetrico = vetorA[vetorA.length - 1 ];
                    
                    System.out.println("Elemento Atual: " + elementoAtual + ", Elemento Simétrico: " + elementoSimetrico);
                }
            }
        }
        
