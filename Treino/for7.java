package Treino;
import java.util.Scanner;


public class for7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int a = input.nextInt();

        for(int i =0; i <= 10; i++){
            System.out.printf("%d X %d = %d\n",i,a,a*i);
        }


        input.close();
    }
}
