package Banco;

public class main {
    public static void main(String[] args) {

        ContaPoupanca contap1 = new ContaPoupanca(1212,0.3);
        contap1.deposito(100.0);
        contap1.setTaxaRendimento(0.3);
        contap1.RendimentoConta();
        

       System.out.println(contap1.getSaldo());
    }
}
