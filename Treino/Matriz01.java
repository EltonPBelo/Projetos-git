    
package Treino;
import java.util.Arrays;
import java.util.Scanner;
public class Matriz01 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos");
        int qtdAlunos = scanner.nextInt();

        System.out.println("Digite a quantidade de notas");
        int qtdNotas = scanner.nextInt();


        Double[][] notasTurma = new Double[qtdAlunos][qtdNotas];

        int total = 0;

        for(int a = 0; a < notasTurma.length; a++){
            for(int n = 0; n < notasTurma[a].length; n++){

                System.out.printf("Informea nota %d do aluno %d ",n+1,a+1);
                notasTurma[a][n] = scanner.nextDouble();

                total += notasTurma[a][n];


            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("A media da turma é: "+media);


        System.out.println("Notas de cada aluno");

        for(Double[] notasAlunos : notasTurma){
            System.out.println(Arrays.toString(notasAlunos));
        }

        scanner.close();


    }
}
