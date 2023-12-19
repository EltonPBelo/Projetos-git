package Treino;

public class Array23 {
    public static void main(String[] args) {
        /*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
        que verifique se "todos" os elementos do vetor A são pares. Se pelo
        menos um elemento do vetor não for par o processo de repetição para
        percorrer os elementos do vetor deve ser encerrado, como sugestão:
        utilize uma variável do tipo flag para atingir este propósito. */

        int[] numeros = {10,8,44,8,78,96,5};
        //int[] numeros = new int[10];
        boolean redFlag = false; 
        //double numeroAleatorio = Math.random() * 11;

        for(int i = 0; i < numeros.length; i++){
            
        }
        
        
        for(int i = 0; i < numeros.length; i++){
            // numeros[i] =(int) (Math.random() * 21);
            System.out.print(numeros[i]+"  ");
            
            if(numeros[i] % 2 !=0){
                redFlag = true;

                 if( redFlag == true){
                    System.out.printf("loop encerrado pois o %d é um número ìmpar",numeros[i]);
                break;
                    
                }
                
            }
        }

        }
    }

