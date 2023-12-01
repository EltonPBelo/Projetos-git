package Treino;

import java.text.DecimalFormat;

public class Array9 {
    public static void main(String[] args) {
        
        float[] VetorA = {12,34,55,74,6};
        float[] VetorB = {110,74,5,4,76};
        float[] VetorC = new float[VetorA.length];

        DecimalFormat df = new DecimalFormat("#.##");

        for(int i=0; i<VetorC.length; i++){
            VetorC[i] = VetorA[i] / VetorB[i];
            String valorf = df.format(VetorC[i]);
            System.out.println(valorf);
        }

    }
}
