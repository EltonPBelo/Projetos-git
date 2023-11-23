package Treino;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Array4 {
   public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    Double[] VetorA = new Double[5];
    Double[] VetorB = new Double[VetorA.length];
    DecimalFormat formato = new DecimalFormat("0.00");
    for(int i = 0; i < VetorA.length; i++){
        
        System.out.printf("Digite o valor que vai ocupar o indice %d: ",i);
        VetorA[i] = input.nextDouble();
        VetorB[i] = Math.sqrt(VetorA[i]);
    }
    System.out.println("Vetor A");
    for(int i = 0; i< VetorA.length; i++){
        System.out.println(VetorA[i]);
    }
    System.out.println("Vetor B");
    for(int i = 0; i< VetorB.length; i++){
        String numeroFormatado = formato.format(VetorB[i]);
        System.out.println(VetorB[i]);
    }
    
    //DecimalFormat formato = new DecimalFormat("#.##" ou "0.00"); ao usar esse objeto nomeado de formato"Eu posso criar um padrão de formatação"
    //String numeroFormatado = formato.format(numero); Exemplo de como usa-lo
    //ATENÇÃO
    //Esse metodo é util apena para demonstração para usuario com fim de mostrar a ele o dado assim como foi feito nesse programa
    //Pra manipular Dados ele é inutil a não ser que seja convertido de volta pra um double
    //EX:
    /* // Converter a string formatada de volta para um número

        double numeroConvertido = Double.parseDouble(numeroFormatado);
 */

    

    input.close();

   } 
}
