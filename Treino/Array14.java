package Treino;

public class Array14 {
  public static void main(String[] args) {

    int[] vetorA = {23,45,67,50,44,24,58,69,102,97,37,};// Array definda...
    int soma = 0;// Variavel a samo dos numeros impares do Arrays
    int impar = 0; //Contador para armazenr a quantidade de números impares do array

    for(int i = 0; i < vetorA.length; i++){ // iteração com laço for
       // vetorA[i]=vetorA[i];// fazendo a iteração

            if(vetorA[i] % 2 != 0){ // if pra capturar os numeros impares(Se o valor for divisivel por 2 e o seu resto for diferente de 0)
                impar++;// adcionando o valor 1 a variavel a cada vez que entrar no loop
                soma += vetorA[i];/*Aqui uma variavel foi criada pra armazenar e somar os valores impara do vetorA, que faz com que o programa armazene o ultimo valor impar e some 
                com o novo valor impar */
                
            
        }  
    }
    System.out.println(" A soma de todos os valores impares é: "+soma);
    System.out.println("A média é: " +(soma/impar));

  }  
}
