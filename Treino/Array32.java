package Treino;

public class Array32 {
    public static void main(String[] args) {
        
        /*32.Criar um vetor A com 5 elementos inteiros. Escreva um programa que
        imprima a tabuada de cada um dos elementos do vetor A. */

        int[] vetorA = {1,2,3,4,5};// Vetor A com os 5 elementos qque irão compor a tabuada
        
        for(int i = 0; i < vetorA.length; i++){ //laço for inicial para percorrer e mostrar um dos 5 números da tabuada
            
            int multiplicador = 0;//valor pra armazenar o elemento
            multiplicador = vetorA[i];// atribuido o valor do vetor ao multiplicador
            System.out.println("Tabuada do "+multiplicador);

            //Etapa de processamento da tabuada
            for(int j = 0; j <= 10; j++){// faz com que a minha tabuada vá do 0 até o 10 (ou seja permite que o valor da vr elemento seja multiplicada até 10)
                int resultado = multiplicador * j; // var para armazenar o resultado
                System.out.println(multiplicador+" X "+ j+" = "+resultado); //impressão dos valores

                // após o j atingir 10 o loop é reiniciado pro loop i
                //repetinto todo o processo até chegar no ultimo valor da lista no caso 5, após isso o programa encerra
            }

        }

    }
}
