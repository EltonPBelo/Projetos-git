package Banco;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int num, double limiteChequeEspecial) {
        super(num);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void saque(double valor) {
        double saldoDisponivel = getSaldo() + limiteChequeEspecial;
        if (valor > saldoDisponivel) {
            System.err.println("ContaCorrente.saque(...): Saque não autorizado. Limite de cheque especial atingido!");
        } else {
            super.saque(valor);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Conta Corrente)";
    }
}
