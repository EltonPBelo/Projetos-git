package Treino;

import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
       
                Scanner input = new Scanner(System.in);
        
                // Lista com números para verificar se é um palíndromo
                int[] numeros = new int[10];
        
                // Variável para detectar se um número é palíndromo
                boolean ehPalindromo = true;
        
                // Vai percorrer o elemento I da lista até a metade através de (i < numeros.length / 2)
                for (int i = 0; i < numeros.length / 2; i++) {
                    System.out.print("Digite o valor " + (i + 1) + ": ");
                    numeros[i] = input.nextInt();
                    if (numeros[i] != numeros[numeros.length - 1 - i]) {
                        ehPalindromo = false;
                        break;
                    }
                }
        
                if (ehPalindromo) {
                    System.out.println("Os valores digitados formam um palíndromo.");
                } else {
                    System.out.println("Os valores digitados não formam um palíndromo.");
                }
                input.close();
}}
    /*Explicação do bloco acima 
         * Vai verificar se a posição I é igual a ultima posição por isso o uso de numeros.lenght
         * e o -1 vai apontar para o ultimo elemento do valor valor, porém ele ficará travado no valor, pois o tamanho do meu vetor é 10
         * ou seja ele ocupa 10 espaços porém ele começa do zero e vai até o 9, contabilizando 10 espaços
         * o -1 vai dizer que ele irá começar pelo tamanho 9 ou seja sua ultima posição
         * por isso e adcionado também o valor -i pra dizer que a posição [i] sera subtraida do valor de numeros
         * ou seja numeros[tamanho de numeros] - 1 menos a sua posição no loop(-i) ){}
         *  exemplo i = 2
         * numeros[2] == numeros[numeros.length que é = a(10)] - 1 -2 que vai dar igual a posição 8         *  */