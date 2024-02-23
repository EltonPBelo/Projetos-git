package Treino;

import java.util.Random;

public class MatrizExercicio {
    public static void main(String[] args) {

/*. Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7. */
        
        int [][] matrizM = new int[10][10];
        int menorLinha5 = 101; //como estamos indo de 0 até 100 colocar 101 fai fazer com que o programa busque o menor numeor de 101 pra baixo
        int maiorLinha5 = 0;
        int maiorValColuna7 = 0; 
        int menorValColuna7 = 101; 

        Random random = new Random();

        //Atribuindo os valores aleatorios na matriz 10x10
        for(int i = 0; i < matrizM.length; i++){
            for(int j = 0; j < matrizM[i].length; j++){
                matrizM[i][j] = random.nextInt(100)+1;
            }
        }

        //Imprimindo os valores da matriz 10x10 gerado por valores aleatorios
        for(int i = 0; i < matrizM.length; i++){
            for(int j = 0; j < matrizM[i].length; j++){
                System.out.print(matrizM[i][j]+"| ");
            }
            System.out.println();
        }

        //coleta do menor e maior valor da linha 5
        for(int i = 0; i < matrizM[5].length; i++){
            for(int j = 0; j < matrizM[i].length; j++){
                if(matrizM[5][j] < menorLinha5){  //Aqui é verificado se o valor da linha 5 é menor que o valor armazenado na var menorValLinha5(que corresponde a 0) se sim aí ele sera armazenado na var
                    menorLinha5 = matrizM[5][j];// é atribuido o valor menor da linha 5 na variavel
                }
                if(matrizM[5][j] > maiorLinha5){
                    maiorLinha5 = matrizM[5][j]
;                }
            }
        }

         //coleta do menor e maior valor da coluna 7
        for(int i = 0; i < matrizM[5].length; i++){
            for(int j = 0; j < matrizM[i].length; j++){
                if(matrizM[i][7] > maiorValColuna7){ //se o valor de matrizM[i][7] for maior que maiorValColuna7(que corresponde a 0) na primeira iteração
                    maiorValColuna7 = matrizM[i][7]; // sera atribuido a variavel cada vez que um valor na coluna 7 for maior que o antigo valor armazendado
                }
                if(matrizM[i][7] < menorValColuna7){ //se o valor de matrizM[i][7] for maior que maiorValColuna7(que corresponde a 0) na primeira iteração
                    menorValColuna7 = matrizM[i][7]; // sera atribuido a variavel cada vez que um valor na coluna 7 for maior que o antigo valor armazendado
                }
            }
        }

        //Impressão dos dados
        System.out.println("Maior valor da linha 5: " + maiorLinha5);
        System.out.println("Menor valor da linha 5: " + menorLinha5);
        System.out.println("Maior valor da coluna 7: " + maiorValColuna7);
        System.out.println("Menor valor da coluna 7: " + menorValColuna7);

    }
}
