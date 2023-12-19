package Treino;

public class array20 {
    public static void main(String[] args) {
        
        /*20.Implementar um programa que obtenha a cotação do dólar (U$) em
        relação ao real (R$) e a seguir armazene em vetor A com 20
        elementos as seguintes conversões:
        21.A[i] = cotação do dolar * i, para todo i variando de 1 até 20. */

        double cotacaoDollar = 5.50f;
     

        double[] moedas = new double[10];
    

        for(int i = 0 ; i < moedas.length ; i++){
         moedas[i] = cotacaoDollar * i ;
         System.out.println("Cotação dollar "+ moedas[i] );
        }
    }
}
