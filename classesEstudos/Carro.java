package classesEstudos;

public class Carro {
    /*Criar uma classe Carro:
Crie uma classe chamada Carro com atributos como modelo, marca, ano, cor etc.
Implemente métodos para ligar o carro, desligar o carro, acelerar e frear. */

public String Cor;
private String nomeVeiculo;
private String AnoFabricacao;
private Double Fipe;
private boolean Motor;
private int velocimetro;
private int velocidadeMaxima = 200;

//metodo construtor
public Carro(String cor){
    this.Motor = false;
    
}
// metodo acessero set pra dizer o nome do carro
public void setNomeCarro(String nomeCarro){
    this.nomeVeiculo = nomeCarro;
}
//metodo pra puxar o nome do carro
public String getNomeCarro(){
    return this.nomeVeiculo;
}

//metodo acessor pra dizer o valor da fipe
public void setFipe(Double valFipe){
    this.Fipe = valFipe;
}
//metodo acessor pra puxar o valor da fipe
public Double getFipe(){
    return this.Fipe;
}
//metodo acessor pra dizer o ano de fabricação do veiculo
public void setAnoFabricacao(String anoCarro){
this.AnoFabricacao = anoCarro;
}
//metodo acessor pra puxar o ano defabricação do veiculo
public String getAnoFabricacao() {
    //System.out.println("O ano de fabricação do seu veiculo é "+this.AnoFabricacao);
    return AnoFabricacao;
}
//função publica pra calcular o valor do ipva
public Double CalcularIpva(Double ipva){

    return this.Fipe*ipva;

}
//metodo acessor pra puxar o ipva
public Double getIpva(){
    return this.Fipe;
}
//função pra dar informação do carro
public void InformacaoCarro(){

    System.out.println("O seu carro é um "+this.nomeVeiculo);

}
// função para ligar o carro
public boolean LigarCarro(){
    return this.Motor = true;
}

//desliga carro
public boolean DesligarCarro(){
    return this.Motor = false;

}
//função paraa acelerar o carro
public void acelerarCarro (){
    if (Motor == false) {
        System.out.println("impossivel acelerar, o carro está desligado!");
    }
    else if(Motor == true){ 
        this.velocimetro += 10;
        System.out.println("Aceleraandoo........\n A velocidade do carro está há "+velocimetro+" KM/H");
        if (velocimetro >= velocidadeMaxima) {// se a minha velocidade for menor que a velocidade
            velocimetro = velocidadeMaxima; // Limita a velocidade máxima
            System.out.println("Velocidade máxima atingida: " + velocidadeMaxima + " KM/H");
        } else {
            System.out.println("Carro acelerado! Velocidade atual: " + velocimetro + " KM/H");
        }
    } else {
        System.out.println("Velocidade máxima atingida: " + velocidadeMaxima + " KM/H");
    }
    }
    

}





