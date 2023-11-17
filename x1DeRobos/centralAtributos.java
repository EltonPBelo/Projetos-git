package x1DeRobos;

public class centralAtributos {
    private String nome;
    private String altura;
    private int pontosDeVida;
    private int dano;
    private String arma1 = "Espada de obsidiana";
    private String arma2 = "Espada de aço vulcanico";
    private String defesa1 = "Couraça de Mamute";
    private String luva = "garraDeTigre";
    private String estiloDeLuta1 = "Rushador";
    private String estiloDeLuta = "calmaria";


public centralAtributos(String Nome,String Altura, int HP){

    this.nome = Nome;
    this.altura = Altura;
    this.pontosDeVida = HP;
}

public void TiposDeArma(){
    System.out.println();
}



}
