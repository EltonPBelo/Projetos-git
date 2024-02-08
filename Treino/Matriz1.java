package Treino;

public class Matriz1 {
    public static void main(String[] args) {
        
        double[][] notasAlunos = new double[3][2];// 3 alunos para 2 notas

        //[3] = qiantidade de linhas
        //[2] = qiantidade decolunas

        //Aluno 1
        notasAlunos[0] [0] = 10;//primeira nota aluno 
        notasAlunos[0] [1] = 9;// segunda nota aluno 
        //Aluno 2
        notasAlunos[1] [0] = 7;
        notasAlunos[1] [1] = 9;
        //aluno 3
        notasAlunos[2] [0] = 10;
        notasAlunos[2] [1] = 7;

        for (int i = 0; i < notasAlunos.length; i++) { //NOtas alunos possui um tamanho de 3(pois são 3 alunos) por isso notasAlunos.length
            for (int j = 0; j < notasAlunos[i].length; j++) { //notasAlunos[i].length quer dizer que enquanto do comprimento j(colunas) for menor que a quantidade de 
                //i(linhas) o loop será executado
                System.out.println("Aluno " + (i + 1) + ", Nota " + (j + 1) + ": " + notasAlunos[i][j]);
            }
        }


        int alunoIndex = 1;
for (double[] notas : notasAlunos) {
    int notaIndex = 1;
    for (double nota : notas) {
        System.out.println("Aluno " + alunoIndex + ", Nota " + notaIndex + ": " + nota);
        notaIndex++;
    }
    alunoIndex++;
}


    }
}
