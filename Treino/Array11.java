package Treino;
public class Array11 {
    public static void main(String[] args) {

        //Contador de numeros pares no Array
        
        int[] VetorA = {127,23,55,71,80,90,124,42,40}; //Defini uma lista
        int contador = 0;//criei um contador pra saber a quantidade de números pares extitentes

/*        System.out.println("Elemento do vetor A");
        for( int i = 0; i < VetorA.length; i++ ) { //Definir como vai ser a iteração do vetorA
            System.out.println(VetorA[i]); //Iprimo o valor A iterado 
            VetorA[i] = VetorA[i]; // poderia fazer assim caso eu não quisese exibir os valores do array na tela. Mas é de suma importância definir 
            Array a ser iterado para podermos acessar os seus elementos
        } */

        for(int i = 0; i < VetorA.length; i++ ) {
            VetorA[i] = VetorA[i];
            if(VetorA[i] % 2==0){
                contador ++;
            }

        }
        System.out.println("Quantidade de numeros pares nesse array é de  "+contador);
    }
}
