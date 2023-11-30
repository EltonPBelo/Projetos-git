package Treino;

public class Array9 {
    public static void main(String[] args) {
        
        float[] VetorA = {12,34,55,74,6};
        float[] VetorB = {110,74,5,4,76};
        float[] VetorC = new float[VetorA.length];

        for(int i=0; i<VetorC.length; i++){
            VetorC[i] = VetorA[i] / VetorB[i];
            System.out.println(VetorC[i]);
        }

    }
}
