package Treino;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] VetorA = new int[5];// cria um array com o nome vetorA e defino que ele terá 5 ocupações na lista
        int[] VetorB = new int[VetorA.length];// Aqui eu defino que o vetorB vai teer o mesmo tamanho do VetorA, o tamanho que o A tiver o B vai ter

        for( int i = 0; i < VetorA.length; i++){ //laço for pra iterar de 1 em 1 os valores da lista A

            System.out.println("Digite o valor do indice" + i+ " :");
            VetorA[i] = input.nextInt();
            VetorB[i] = VetorA[i];// faço a copia do vetor A, Agora o vetor b é igual em valores
            //oque antes era só em tamnhao devido ao [VetorA.length] agora eles são iguais em tudo(indices e valores)
           
        }

        //Laço for pra eu imprimir os valores dos arrays
        System.out.print("Vetor A é = ");
        for(int i = 0; i < VetorA.length; i++){
            System.out.print(VetorA[i] + " \n");
        }
        System.out.print("Vetor B é = ");
        for(int i = 0; i < VetorB.length; i++){
            System.out.print(VetorB[i] + " ");
        }
        
        
        input.close();
  


    }
}
