package Treino;

public class Array17 {
    public static void main(String[] args) {
        /**.Ler um vetor A com 10 elementos inteiros correspondentes as idades
            de um grupo de pessoas. Escreva um programa que determine e
            escreva a quantidade de pessoas que possuem idade superior a 35 anos. */
            int[] idades = {24,45,17,50,14,23,48,69,10,27,37,};
           
            //crio variavei para armazenar os valores

            //pra armazenar indices
            int maior = idades[0];
            int menor = idades[0];

            //pra armazenar valores
            int indexMenorNum = 0;
            int indexMaiorNum = 0;

            //laço for para iterar os valores
            for(int i = 0; i < idades.length; i++){
                if(idades[i] > maior){
                    maior = idades[i];// Atribuo o maior valor do index a variavel maior
                    indexMaiorNum = i;// pego a sua maior posição no loop no momento que cai no else if e armazeno sua posição na var indexMenor Num
                }
                else if(idades[i] < menor){
                    menor = idades[i]; // Atribuo o menor valor do index a variavel menor
                    indexMenorNum = i; // pego a sua menor posição no loop no momento que cai no else if e armazeno sua posição na var indexMenor Num
                }
            }
            System.out.printf("Menor idade = %d\nIndice da menor idade = %d\nMaior idade = %d\nIndice da menor idade = %d",menor,indexMenorNum,maior,indexMaiorNum);
    }
}
