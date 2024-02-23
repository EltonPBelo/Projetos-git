package Treino;

import java.util.Scanner;

public class ExercicioMariz3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] agenda = new String[30][24]; 
        Boolean flag = false;
        Byte opcao;

        while(!flag){
            
            System.out.println("Digite 1 para adcionar um compromisso");
            System.out.println("Digite 2 para verificar um coompromisso");
            System.out.println("Digite 0 para sair");

            opcao = input.nextByte();
            
            if(opcao == 1){//Adcionar compromisso
                boolean diaValido = false;
                int dia = 0;
                int hora = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = input.nextInt();

                    if(dia > 0 && dia <= 30){
                        diaValido = true;

                    }
                    else{
                        System.out.println("Dia inválido digite novamente");
                    }

                    boolean horaValida = false;
                    while (!horaValida) {
                        System.out.println("Entre com a hora do compromisso: ");
                        hora = input.nextInt();
    
                        if(hora >= 0 && hora <= 24){
                            horaValida = true;
    
                        }
                        else{
                            System.out.println("hora inválido digite novamente");
                        }
                    }
                }
               dia--;     
               System.out.println("Digite o compromisso");
            agenda[dia][hora] = input.next();
                

            }
            else if(opcao == 2){//verificar compromisso

                boolean diaValido = false;
                int dia = 0;
                int hora = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = input.nextInt();

                    if(dia > 0 && dia <= 30){
                        diaValido = true;

                    }
                    else{
                        System.out.println("Dia inválido digite novamente");
                    }

                    boolean horaValida = false;
                    while (!horaValida) {
                        System.out.println("Entre com a hora do compromisso: ");
                        hora = input.nextInt();
    
                        if(hora >= 0 && hora <= 24){
                            horaValida = true;
    
                        }
                        else{
                            System.out.println("hora inválido digite novamente");
                        }
                    }
                }
                dia--;     
               System.out.println("O compromisso agendado é: ");
            System.out.println(agenda[dia][hora]);
            }


            else if(opcao == 0){//Sair    
                flag = true;
            }
            else{
                System.out.println("Valor inválido!!! tente novamente");
            }


        }





    } 
}
