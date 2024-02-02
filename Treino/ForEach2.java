package Treino;

import java.util.Random;

public class ForEach2 {
    
public static void main(String[] args) {
    
int[] notas = new int[10];

Random random = new Random();


for(int i = 0; i<notas.length; i++) {

    notas[i] = random.nextInt(10);
    
}

for(int i = 0; i<notas.length; i++){
System.out.println(notas[i]);
}

/*
A estrutura do forEach é basicamente essa lógica
int nota = notas[i] */
System.out.println("ForEach");

for(int nota:notas){
System.out.println(nota);

}

//Para setar valores no for(coletar dados), deve ser usado o for normal, para dar output deve ser usado o forEach


/*No entanto, vale ressaltar que o laço forEach não é a melhor escolha em todos os cenários.
 Existem situações em que o uso de um loop tradicional for ou while pode ser mais apropriado,
  especialmente quando você precisa de acesso explícito aos índices dos elementos.
 O forEach é mais voltado para situações em que a simplicidade e a legibilidade do código são prioridades. */


}}
