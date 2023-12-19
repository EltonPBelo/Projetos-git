package Treino;

public class array22 {
    public static void main(String[] args) {
        /*.Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
        0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
        para implementar um programa que determine o percentual de
        números 0's e 1's existentes no vetor A. */

        //Array onde os numeros serão armazenados
        int[] numeros = new int [15];

        //variavei que servirão de contadores para indicar a quantidade de cada elemento
        int zeros = 0;
        int ums = 0;
  
        //A sua iteração pra preencer os valores do Array / loop pra percorrer o array e preenchelo
        for(int i = 0; i < numeros.length; i++){

            numeros[i] = (int)Math.round(Math.random()) * 1;
            /* Explicação desse bloco | numeros[i] = (int)Math.round(Math.random()) * 1;
             * Math.randon() vai retornar por padrão um valor 0.123456 ou 0.789012
             * que nesse caso eu quero apenas 0 ou 1
             * por isso Math.random() * 1, foi multiplicado 
            */
            System.out.print(numeros[i] +" ");
            if (numeros[i] == 0) {
                zeros++;
            }
            else{
                ums++;
            }
        }
        double porcentagem0 = (zeros *100) / numeros.length;
        double porcentagem1 = (ums *100) / numeros.length;
        System.out.println("\nTotal de números um "+porcentagem1+ "% Total de zeros:"+porcentagem0+"%");
    }
}
