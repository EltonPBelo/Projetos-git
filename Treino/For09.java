package Treino;

import java.util.Scanner;

public class For09 {
    public static void main(String[] args) {

        //--> criação do scanner pra coletar dados via teclado
        Scanner input = new Scanner(System.in);//a

        System.out.print("Informe quantas notas serão armazenadas e calculadas a média: ");
        int valoresNotas = input.nextInt();//Valor do tipo inteiro que vai definir a quantidade de casas para armazenar notas no array
        float soma = 0; //Variavel paraarmazenar as somas dos elementos do array e posteriormente ser calculada a média através dessa var
        float[] notas = new float[valoresNotas];//Array que vai armazenar notas do tipo float( Tamanho do Array vai ser definido pelo teclado)

        //Laço for para atribuir o valor em cada casa dos Arrays
        for(int i=0; i < notas.length; i++) {

            System.out.print("Digite a "+(i+1)+"* nota:  ");
            float nota = input.nextFloat();//Coleta do dado
            notas[i] = nota; // Momento em que a nota digitada pelo teclado vai ser armazenada na posição i do Array
        }

        //For each para somar todos os valores do array
        for (float nota : notas) {
            soma += nota;
        }

        // calculo da média do array
        float media = soma / valoresNotas;

        System.out.printf("A média das notas apresentadas é %.2f ",media);

        

    }
}
