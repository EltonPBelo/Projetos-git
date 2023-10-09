import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int parametroUm = input.nextInt();
        int parametroDois = input.nextInt();

        try{
            contar(parametroUm,parametroDois)
        }catch(ParametrosInvalidosException ){
            System.out.println("O Segundo parametro deve ser maior que o primeiro");


        }
        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

            int contagem = parametroDois - parametroUm;

        }
    }
    
}
