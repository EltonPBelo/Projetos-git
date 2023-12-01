package Treino;

public class Array12 {
    public static void main(String[] args) {
        
        int[] VetorA = {1,1,1,1,1};
        // precciso de um inteireo para armazenar a soma
        for(int i = 0; i < VetorA.length; i++){
            VetorA[i] += VetorA[i];
            System.out.println(VetorA[i]);
        }
            
            
    }
}
