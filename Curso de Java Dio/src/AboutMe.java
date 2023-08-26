import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);//vai usar o padrão de dados do EUA ou seja apena "." e não virgula em dados double vai funcionar

        String nome;
        int idade;
        double altura;

        System.out.print("nome: ");
        nome = input.next();

        System.out.print("idade: ");
        idade = input.nextInt();

        System.out.print("altura: ");
        altura = input.nextDouble();

        System.out.printf("Seu nome é %s voçê tem %d anos de idade e possui %.2f de altura",nome,idade,altura);

        input.close();

    }
    
}
