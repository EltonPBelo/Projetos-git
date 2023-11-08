package classesEstudos;

public class CarroTeste {
    public static void main(String[] args) {
        
        Carro v1 = new Carro("Amarelo","Irineu","15624-99554");

        //etapa de coleta de informacoes

        v1.setNomeCarro("Corsa");
        v1.setAnoFabricacao("2010/2001");
        v1.setFipe(125000.00);
        v1.CalcularIpva(0.02);
        v1.InformacaoCarro();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //parte funcional

    v1.LigarCarro();
    v1.acelerarCarro();
    v1.acelerarCarro();
    v1.freioParcial();
    v1.acelerarCarro();
    v1.acelerarCarro();
    v1.frearCarroEmergencial();

    }
}
