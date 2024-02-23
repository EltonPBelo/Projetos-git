package Treino;

import java.util.Scanner;

public class MatrizExe02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[][] matrizes = new int[3][3];

        int qtdpares = 0;
        int qtdImpares = 0;

        for(int i = 0; i < matrizes.length; i++) {
            for(int j = 0; j < matrizes[i].length; j++) { //O J vai pessear pela coluna i
                System.out.println("Digite o valor da coluna "+(i+1)+ " da linha "+(j+1));
                matrizes[i][j] = entrada.nextInt();
                if(matrizes[i][j] % 2 == 0){
                    qtdpares++;
                }
                else{
                    qtdImpares++;
                }
            }
        }

        for(int i = 0; i < matrizes.length; i++) {
            for(int j = 0; j < matrizes[i].length; j++) { //O J vai pessear pela coluna i

                System.out.print(matrizes[i][j] + " |");
        }
            System.out.println();
            }

            System.out.println("Quantidade de numeros pares "+qtdpares);
            System.out.println("Quantidade de numeros impares "+qtdImpares);

    entrada.close();
        
    }
}
