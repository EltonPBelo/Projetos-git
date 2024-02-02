package Treino;

public class ForEach06 {
    public static void main(String[] args) {
        
        int[] vetorA = {1,11,2,3,4,5,6,7,8,9,10,5,10,4,7,19,16};

        char[] vetorB = new char[vetorA.length];
        
        for( int i = 0; i < vetorA.length; i++ ){
            if (vetorA[i] <= 7) {
                vetorB[i] = 'a';
            }
            else if(vetorA[i] == 7){
                vetorB[i] = 'b';
            }
            else if (vetorA[i] > 7 && vetorA[i] <= 10) {
                vetorB[i] = 'c';
                
            }
            else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            }
            else if (vetorA[i] > 10){
                vetorB[i] = 'e';
            }
        }
        
        System.out.println("Mostrando o vetor B");
        
        for( int i = 0 ; i < vetorB.length; i++ ){
        
            System.out.print(vetorB[i]+"| ");
        
        }

    }
}
