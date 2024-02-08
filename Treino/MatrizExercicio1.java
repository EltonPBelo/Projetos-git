package Treino;

import java.util.Random;

public class MatrizExercicio1 {
    public static void main(String[] args) {
        
    /*1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
    9. Após isso determine o maior número da matriz e a sua posição
    (linha, coluna). */
    Random random = new Random();    

    int[][] matrizes = new int[4][4];
    int maiorNum = 0;
    int linhaMaiorNum = 0;// variaveis criada para poder acessar a posiçao da linha e coluna aonde o maior valor está localizado
    int colunaMaiorNum = 0;


    for(int i = 0; i < matrizes.length; i++) {
        for(int j = 0; j < matrizes[i].length;j++){
            matrizes[i][j] = random.nextInt(100);

        }
    }

    for(int i = 0; i < matrizes.length; i++) {
        for(int j = 0; j < matrizes[i].length; j++) {

            //vendo e armazenando o maior valor e a sua localização
          if(matrizes[i][j] > maiorNum){
            maiorNum = matrizes[i][j];
            linhaMaiorNum = i+1;
            colunaMaiorNum = j+1;
          }
        }
    }

    System.out.println("Matriz 4x4 com valores aleatórios entre 0-100:");
    for(int i = 0; i < matrizes.length; i++) {
        for(int j = 0; j < matrizes[i].length;j++){
            System.out.print(matrizes[i][j]+" ");
        }
       System.out.println(); 
    }

    // Imprimindo o maior número e sua posição
    System.out.println("Maior número da matriz: " + maiorNum);
    System.out.println("Posição (linha, coluna): (" + linhaMaiorNum + ", " + colunaMaiorNum + ")");

}
}
