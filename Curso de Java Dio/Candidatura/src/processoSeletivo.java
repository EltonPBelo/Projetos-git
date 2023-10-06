import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) {
        
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Messi","Neymar","Haaland","Ronaldo","Coutinho","Vini Jr","Lewadowski","Belligham","Rodrygo","Pedri"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        Double salarioBase = 2000.0;

        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            Double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+ candidato+" Solicitou esse salario "+salarioPretendido+"R$");
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidado "+candidato+" foi selecionado para vaga");
                candidatosSelecionados++;

            }
            candidatoAtual++;
        }

       
    }
        static Double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0,2000.0);
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
