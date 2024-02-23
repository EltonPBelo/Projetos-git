package BeeCrowd.JavaCodes;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double pi = 3.14159;
        double raio = input.nextDouble();
        raio = Math.pow(raio, 2);
        double area = pi * raio;

        //System.out.printf("A=%.4f", area);
        System.out.printf("A=%.4f%n", area);

        input.close();

    }
}
