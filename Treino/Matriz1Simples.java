package Treino;

public class Matriz1Simples {
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


        for(int i = 0 ; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length; j++){ // vai percorrer todos os elementos da coluna referente ao valor, e irar armazenar a nota em cada coluna
               // System.out.print(notasAlunos[i][j] +" "); 
                System.out.println("Aluno " + (i + 1) + ": Nota " + (j + 1) + ": " + notasAlunos[i][j]);
            }
            System.out.println();// após exucar as duas notas de cada aluno um espaço em branco vai ser colocado


    }

    double soma;

    System.out.println("Calculando a média dos alunos");
    for(int i = 0 ; i < notasAlunos.length; i++){
        soma = 0;
        for(int j = 0; j < notasAlunos[i].length; j++){
            soma += notasAlunos[i][j];
        
        
        }
    
        System.out.println("A média do aluno "+(i+1)+" é "+(soma/4));
    }


    //Forma de inicializar uma matriz de uma forma direta

    double[][] exemplo = {{4,7,8},{1,2,3}};

}
}
