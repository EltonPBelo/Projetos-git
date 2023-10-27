package AtividadePOO;

public class Main {

    public static void main(String[] args) {
        CadastroDeOnibus onibusDisponiveis = new CadastroDeOnibus();
        Onibus onibus00 = new Onibus(01, "Guarabira - JoãoPessoa - Guarabira", 22);
        Onibus onibus01 = new Onibus(02, "Guarabira - Campina Grande - Guarabira", 15);
        Onibus onibus02 = new Onibus(03, "Guarabira - Natal - Guarabira", 20);
        
        onibusDisponiveis.adicionarNovoOnibus(onibus00);
        onibusDisponiveis.adicionarNovoOnibus(onibus01);
        onibusDisponiveis.adicionarNovoOnibus(onibus02);
        
        onibusDisponiveis.imprimeTodosOsOnibusDisponiveis();
        
        
    }
}
 