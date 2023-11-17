package Banco;

public class ContaPoupanca extends Conta{
    private double juros;

    public ContaPoupanca(int num, double juros) {
        super(num);
        this.juros = juros;
    }

    public void adicionarRendimentos() {
        double rendimento = getSaldo() * (juros / 100);
        deposito(rendimento);
    }

    @Override
    public String toString() {
        return super.toString() + " (Conta Poupança)";
    }
        
    }

