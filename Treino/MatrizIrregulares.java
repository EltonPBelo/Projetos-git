package Treino;

import java.util.Scanner;

public class MatrizIrregulares {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas foram intrevistadas: ");
        int pessoasIntrevistadas = scan.nextInt();


        String [][] numerosDeFilhos = new String[pessoasIntrevistadas][];

        for(int i = 0; i < numerosDeFilhos.length; i++) {

            System.out.println("Quantos filhos o entrevistado de numero "+(i+1)+" tem? :");   
            int filhos = scan.nextInt();
            numerosDeFilhos[i] = new String[filhos];
            
            for(int j = 0; j < numerosDeFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho "+(j+1)+":  ");
                numerosDeFilhos[i][j] = scan.next();
            }


        }

        for(int i = 0; i < numerosDeFilhos.length; i++) {
            System.out.println("Pessoa "+(i+1)+" possui "+numerosDeFilhos.length+" filhos ");

            for(int j = 0; j < numerosDeFilhos[i].length; j++) {
                System.out.println();
                System.out.println(numerosDeFilhos[i][j] );



            }
    }
                scan.close();
    }
}
