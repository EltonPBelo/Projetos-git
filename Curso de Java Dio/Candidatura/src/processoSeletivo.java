import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) {
      // selecaoCandidatos();//chamo meu medoto pra ser executado 
       imprimirSelecionados();
       
    }

    static void imprimirSelecionados(){
    String [] candidatos = {"Messi","Neymar","Haaland","Ronaldo","Coutinho","Vini Jr","Lewadowski","Belligham","Rodrygo","Pedri"};//defino uma lista com os nomes que vai de 0 até 9
        System.out.println("Imprimindo selecionados imprimindo o indice ddo elemento");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato selecionado de Número: " +(indice+1)+" é "+candidatos[indice] );// ao usar (indice+1) esse termo na impressão minha lista vai eliminar o numero zero fazendo com que o messe fique no indice 1 na impressão 
            
        }
    }



    static void selecaoCandidatos(){
        String [] candidatos = {"Messi","Neymar","Haaland","Ronaldo","Coutinho","Vini Jr","Lewadowski","Belligham","Rodrygo","Pedri"};//defino uma lista com os nomes que vai de 0 até 9

        int candidatosSelecionados = 0; //vai me mostrar quantos candidatos foram aprovados pra vaga
        int candidatoAtual = 0;//vai fazer com que os nome em minha lista saia e vá para o proximo indice
        Double salarioBase = 2000.0;// salario que base que o programa espra receber

        while(candidatosSelecionados < 5){ // enquantos meus candidatos aprovados forem menor que 5 vai executar esse loop
            String candidato = candidatos[candidatoAtual]; //var criada pra saber qual canditado vai ser analisado 
            Double salarioPretendido = valorPretendido();//Usamos a função criada pra analisar o salario do candidato
            System.out.println("O candidato "+ candidato+" Solicitou esse salario "+salarioPretendido+"R$");
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidado "+candidato+" foi selecionado para vaga");
                candidatosSelecionados++;// vai colocar na var quanto candidatos foram aprovados

            }
            candidatoAtual++;// vai passar pro proximo candidato
        }

       
    }
    static Double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800.0,3000.0);
    }

    static void  analisarCandidato(Double salarioPretendido){ //função pra analisar candidato

        Double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");

        }else if(salarioBase == salarioPretendido){
            System.out.println("OFERECER UMA CONTRAPROPOSTA");
        }
        
        else{
        System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS!");
        }
    }
}
