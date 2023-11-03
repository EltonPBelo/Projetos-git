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


public void setNomeCarro(String nomeCarro){
    this.nomeVeiculo = nomeCarro;
}

public String getNomeCarro(){
    return this.nomeVeiculo;
}

public Carro(String cor){
    this.Motor = false;
    
}

public void setFipe(Double valFipe){
    this.Fipe = valFipe;
}

public Double getFipe(){
    return this.Fipe;
}

public void setAnoFabricacao(String anoCarro){
this.AnoFabricacao = anoCarro;
}
public String getAnoFabricacao() {
    //System.out.println("O ano de fabricação do seu veiculo é "+this.AnoFabricacao);
    return AnoFabricacao;
}

public Double CalcularIpva(Double ipva){

    return this.Fipe*ipva;

}

public Double getIpva(){
    return this.Fipe;
}

public void InformacaoCarro(){

    System.out.println("O seu carro é um "+this.nomeVeiculo);

}


}
