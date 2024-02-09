package Treino;

import java.util.Random;

public class RefaEXEmatriz {
    public static void main(String[] args) {

        int maiorNum = 0;
        int localizacaoLinhaMaiorNum = 0;
        int localizacaoColunaMaiorNum = 0;

        Random numeroRandom = new Random();
        
        int[][] matrizes = new int [4][4];

        //laço for inicial pra armazenar os valores nas linhas e colunas
        for(int i = 0; i < matrizes.length; i++){
            for(int j = 0; j < matrizes[i].length; j++){
                matrizes[i][j] = numeroRandom.nextInt(100);
            }
        }

        //laço for para vez e armazenar o maior valor e sua localização nas colunas
        for(int i = 0; i < matrizes.length; i++ ){
            for(int j = 0; j < matrizes[i].length; j++){
                
                if(matrizes[i][j] > maiorNum){
                    maiorNum = matrizes[i][j]; // vai pegar o maior valor armazenado na linha i da coluna j e armazenar nessa variavel
                    localizacaoLinhaMaiorNum = i + 1; // vai armazenar nessa variavel a linha onde se encontra o maior valor
                    localizacaoColunaMaiorNum = j + 1; //vai armazenar nessa variavel a coluna onde se encontra o maior valor
                }
            }

        }

        //Imprimindo os valores
        for(int i = 0; i < matrizes.length; i++){
            for(int j = 0; j < matrizes[i].length; j++){
                System.out.print(matrizes[i][j]+" | ");
            }
            System.out.println();
        }

        System.out.println("O maior valor dessa matriz 4 X 4 é: "+maiorNum);
        System.out.println("Ele se encontra na linha: "+ localizacaoLinhaMaiorNum);
        System.out.println("Ele se encontra na coluna: "+ localizacaoColunaMaiorNum);




        




    }
}
