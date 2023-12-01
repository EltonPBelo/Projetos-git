package Treino;

import java.text.DecimalFormat;

public class Array10 {
    public static void main(String[] args) {
        
        float[] VetorA = {150,345,555,200,23,14};
        float[] VetorB = new float[VetorA.length];
        DecimalFormat dFormat = new DecimalFormat("#.##");

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println(VetorA[i] + " " );
        }
        for(int i = 0; i < VetorB.length; i++) {
            VetorB[i] = VetorA[i] % 2;
            System.out.println(dFormat.format(VetorB[i]) + " " );
        }
        
    }
}
