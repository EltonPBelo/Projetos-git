package classesEstudos;
import java.util.ArrayList;
import java.util.List;

public class onibus {
    
    class Motorista {
        private String nome;
        private String numeroHabilitacao;
        private int idade;
    
        // Construtor, getters e setters
    }
    
    class Passageiro {
        private String nome;
        private String registroIdentidade;
        private int idade;
        private boolean meiaEntrada;
    
        // Construtor, getters e setters
    }
    
    class Viagem {
        private String origem;
        private String destino;
        private boolean emDeslocamento;
        private List<Passageiro> passageiros = new ArrayList<>();
        private Motorista motorista;
        private double valorPassagem;
        private int capacidadeOnibus;
        private int passageirosInteiros;
        private int passageirosMeiaEntrada;
        private double totalArrecadado;
    
        // Construtor, métodos para iniciar, finalizar a viagem, adicionar passageiros, calcular arrecadação, etc.
    }
    
    class Onibus {
        private int numeroOnibus;
        private String trajeto;
        private List<Viagem> viagens = new ArrayList();
    
        // Construtor, métodos para adicionar viagens, obter informações do ônibus, etc.
    }
     
}
