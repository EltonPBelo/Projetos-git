package Treino;

public class MatrizTridimensional {
    public static void main(String[] args) {
        
        int[][][] MatrizTridimensional = new int [3][3][3];
        int soma = 0;
        int somapares = 0;
        int somaImpares = 0;



        for(int i =0; i < MatrizTridimensional.length; i++){
            for(int j = 0; j < MatrizTridimensional[i].length; j++){
                for(int k = 0; k < MatrizTridimensional[i][j].length; k++){
                    System.out.println("I = "+i+ "| j = "+j+"| k = "+k);
                    MatrizTridimensional[i][j][k] = i + j+ k;
                    soma += MatrizTridimensional [i][j][k];

                    if (MatrizTridimensional [i][j][k] % 2 == 0) {
                        somapares += MatrizTridimensional [i][j][k];
                    }
                    else{
                        somaImpares += MatrizTridimensional [i][j][k];
                    }
                }

            }
        }

        System.out.println("Soma total: "+soma);
        System.out.println("Soma total de pares: "+somapares);
        System.out.println("Soma total de impares: "+somaImpares);



    }
}
