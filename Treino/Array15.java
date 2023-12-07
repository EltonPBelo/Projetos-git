package Treino;

public class Array15 {
    public static void main(String[] args) {
        
        int[] vetorA = {123,45,67,80,90,64,35,12,11,133,55,78,67};
        int par = 0;
        int impar = 0;
        int porcemtagemPar = 0;
        int porcemtagemImpar = 0;

/*Colocar um zero na variavel é necessario pra ela ser inicializada corretamente
 * pois se eu não tivesse há inicializado ela so poderia ser acessada fora do escopo depois do resultado final, mas como ela já foi inicializada
 * com o valor 0 eu posso acessa-lá em qualquer desses laços for ou if
 */


        for(int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0) {
                par++;                
                porcemtagemPar = (par * 100) / vetorA.length;
            }
        }
        for(int i = 0; i < vetorA.length; i++){ 
            if(vetorA[i] % 2 !=0){
                impar++;
                porcemtagemImpar = (impar * 100) / vetorA.length;
                
            }
        }

            System.out.printf("Nessa Array que possui um tamanho de %d o precentual de numeros pares é de %d e de numeros impares é de %d  ",vetorA.length, porcemtagemPar,porcemtagemImpar);
            

    }
}
