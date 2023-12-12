package Treino;

import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double[] notas1 = new double[5];
        double[] notas2 = new double[notas1.length];
        double[] resultados = new double[notas1.length];

        for(int i = 0; i < notas1.length; i++) {

            System.out.print("Entre com a nota "+(i +1)+" do primeiro aluno :");
            notas1[i] = input.nextDouble();

            System.out.print("Entre com a nota "+(i +1)+" do segundo aluno :");
            notas2[i] = input.nextDouble();

            resultados[i] = (notas1[i] + notas2[i]) / 2;

    }
        System.out.println("Notas aluno 1");
        for(int i = 0; i < notas1.length; i++){
            System.out.print(notas1[i]+" ");
        }

        System.out.println("Notas aluno 2");
        for(int i = 0; i < notas1.length; i++){
            System.out.print(notas2[i]+" ");
        }

        System.out.println("Resultado");
        for(int i = 0; i < notas1.length; i++){
            if (resultados[i] >= 7) {
                System.out.println(resultados[i]+" Aprovado");
            }
            else{
                System.out.println(resultados[i]+" Reprovado");
            }
        }
}
}
