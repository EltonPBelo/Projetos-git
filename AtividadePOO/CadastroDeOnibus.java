package AtividadePOO;


import java.util.ArrayList;
import java.util.List;


public class CadastroDeOnibus {
    private List<Onibus> onibusDisponiveis;
    //construtor
    
    public CadastroDeOnibus(){
        //fazendo a instância do arraylist
        this.onibusDisponiveis = new ArrayList<Onibus>();
    }
    
    public void adicionarNovoOnibus(Onibus novoOnibus){
        this.onibusDisponiveis.add(novoOnibus);
    }
    
    public void imprimeTodosOsOnibusDisponiveis(){
        for (Onibus index : onibusDisponiveis){
            System.out.println(index.toString());
        }
    }
}
