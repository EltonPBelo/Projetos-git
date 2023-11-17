package Banco;

import java.util.ArrayList;
import java.util.List;


public class Banco {
private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void abrirConta(Conta conta) {
        contas.add(conta);
    }

    public void fecharConta(Conta conta) {
        contas.remove(conta);
    }

    public void pagarBoleto(Conta conta, double valor) {
        conta.saque(valor);
    }

    public void atualizarContas() {
        for (Conta conta : contas) {
            if (conta instanceof ContaPoupanca) {
                ContaPoupanca poupanca = (ContaPoupanca) conta;
                poupanca.adicionarRendimentos();
            }

            System.out.println(conta);
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criando contas de teste
        Conta conta1 = new Conta(1);
        ContaPoupanca poupanca1 = new ContaPoupanca(2, 2.5);
        ContaCorrente corrente1 = new ContaCorrente(3, 1000);

        // Adicionando contas ao banco
        banco.abrirConta(conta1);
        banco.abrirConta(poupanca1);
        banco.abrirConta(corrente1);

        // Testando operações
        conta1.deposito(1000);
        poupanca1.deposito(2000);
        corrente1.deposito(3000);

        banco.atualizarContas();
    }    
}
