package Treino;

public class Array13 {
    public static void main(String[] args) {
        
        int[] VetorA = {25,34,50,70,45,23,12};
        int contador = 0;
        int soma = 0;

        for(int i =0; i < VetorA.length; i++) {
            VetorA[i] = VetorA[i];
            if(VetorA[i] % 5 == 0){
                soma += VetorA[i];
                contador ++;
                System.out.println("O número "+VetorA[i]+ " é divisivel por 5");
            }
        }
        System.out.println("O Arrray VetorA possui "+contador+" Números divisiveis por 5"+" E a sua soma geral é :  "+soma);

    }
}
