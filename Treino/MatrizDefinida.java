package Treino;

public class MatrizDefinida {
    public static void main(String[] args) {
        

        // Declaração de uma matriz tridimensional com dimensões 3x3x3
        int[][][] MatrizTridimensional = new int[3][3][3];
        
        // Variáveis para armazenar a soma total, soma de pares e soma de ímpares
        int soma = 0;
        int somapares = 0;
        int somaImpares = 0;

        // Loop externo para percorrer a dimensão "i"
        for(int i = 0; i < MatrizTridimensional.length; i++){
            
            // Loop do meio para percorrer a dimensão "j"
            for(int j = 0; j < MatrizTridimensional[i].length; j++){
                
                // Loop interno para percorrer a dimensão "k"
                for(int k = 0; k < MatrizTridimensional[i][j].length; k++){
                    
                    // Imprime os índices atuais para ilustrar a posição na matriz
                    System.out.println("I = " + i + " j = " + j + " k = " + k);
                    
                    // Preenche cada posição da matriz com a soma dos índices
                    MatrizTridimensional[i][j][k] = i + j + k;

                    /*MatrizTridimensional[i][j][k] = i + j + k;
Essa linha de código está atribuindo a cada elemento da matriz tridimensional (MatrizTridimensional) um valor que é a soma dos índices i, j e k.
 Vamos entender isso com um exemplo mais simples:
Suponha que i = 1, j = 2 e k = 0. Então, a atribuição seria:

MatrizTridimensional[1][2][0] = 1 + 2 + 0;
Aqui, MatrizTridimensional[1][2][0] refere-se ao elemento na linha 1, coluna 2 e profundidade 0 da matriz tridimensional.
 O valor atribuído será a soma dos índices, que é 3 neste caso. 
 
 Portanto, essa parte do código está simplesmente preenchendo cada elemento da matriz tridimensional com a soma dos índices correspondentes,
  o que ajuda a ilustrar a posição de cada elemento na matriz.
 Essa técnica é comumente usada para inicializar valores em uma matriz de forma sistemática.*/
                    
                    // Calcula a soma total dos elementos da matriz
                    soma += MatrizTridimensional[i][j][k];
                    
                    // Verifica se o elemento é par e adiciona à soma de pares
                    if (MatrizTridimensional[i][j][k] % 2 == 0) {
                        somapares += MatrizTridimensional[i][j][k];
                    } else {
                        // Adiciona à soma de ímpares se não for par
                        somaImpares += MatrizTridimensional[i][j][k];
                    }
                }
            }
        }

        // Imprime os resultados
        System.out.println("Soma total: " + soma);
        System.out.println("Soma total de pares: " + somapares);
        System.out.println("Soma total de ímpares: " + somaImpares);
    }
}
    
