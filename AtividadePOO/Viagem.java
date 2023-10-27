package AtividadePOO;

import java.util.ArrayList;
import java.util.List;


public class Viagem {
    private String origem;
    private String destino;
    private boolean emDeslocamento;
    private List<Passageiro> passageiros;
    private Motorista motorista;
    private double valorPassagem;
    private int capacidadeOnibus;
    private int passageirosInteiros;
    private int passageirosMeiaEntrada;
    private double totalArrecadado;

    public Viagem(String origem, String destino, boolean emDeslocamento, List<Passageiro> passageiros, Motorista motorista, double valorPassagem, int capacidadeOnibus, int passageirosInteiros, int passageirosMeiaEntrada, double totalArrecadado) {
        this.origem = origem;
        this.destino = destino;
        this.emDeslocamento = emDeslocamento;
        this.passageiros = new ArrayList<Passageiro>();
        this.motorista = motorista;
        this.valorPassagem = valorPassagem;
        this.capacidadeOnibus = capacidadeOnibus;
        this.passageirosInteiros = passageirosInteiros;
        this.passageirosMeiaEntrada = passageirosMeiaEntrada;
        this.totalArrecadado = totalArrecadado;
    }

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public boolean isEmDeslocamento() {
        return emDeslocamento;
    }
    public void setEmDeslocamento(boolean emDeslocamento) {
        this.emDeslocamento = emDeslocamento;
    }
    public List<Passageiro> getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public double getValorPassagem() {
        return valorPassagem;
    }
    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }
    public int getCapacidadeOnibus() {
        return capacidadeOnibus;
    }
    public void setCapacidadeOnibus(int capacidadeOnibus) {
        this.capacidadeOnibus = capacidadeOnibus;
    }
    public int getPassageirosInteiros() {
        return passageirosInteiros;
    }
    public void setPassageirosInteiros(int passageirosInteiros) {
        this.passageirosInteiros = passageirosInteiros;
    }
    public int getPassageirosMeiaEntrada() {
        return passageirosMeiaEntrada;
    }
    public void setPassageirosMeiaEntrada(int passageirosMeiaEntrada) {
        this.passageirosMeiaEntrada = passageirosMeiaEntrada;
    }
    public double getTotalArrecadado() {
        return totalArrecadado;
    }
    public void setTotalArrecadado(double totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
    } 
    
}

