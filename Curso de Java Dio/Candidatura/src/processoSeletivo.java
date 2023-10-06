public class processoSeletivo {
    public static void main(String[] args) {
        
    }

    static void selecaoCandidatos(){}


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
