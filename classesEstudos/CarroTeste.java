package classesEstudos;

public class CarroTeste {
    public static void main(String[] args) {
        
        Carro veiculo = new Carro("Azul",78000.0);

        veiculo.setAnoFabricacao("2016/2017");
        veiculo.getAnoFabricacao();
        veiculo.CalcularIpva();

    }
}
