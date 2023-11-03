package classesEstudos;

public class CarroTeste {
    public static void main(String[] args) {
        
        Carro v1 = new Carro("Preta");

        v1.setNomeCarro("Corsa");
        
        //vai pegar o parametro do valor do meu carro
        v1.setFipe(100000.0);

        //vou coletar o dado coletado do setFipe e imprimir ele
        v1.getFipe();
        //System.out.println(v1.getFipe());
        

        //Vai imprimir o valor do meu ipva
        System.out.println(v1.CalcularIpva(0.04)+"R$");
        System.out.println(v1.getNomeCarro());


    }
}
