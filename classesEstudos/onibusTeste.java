package classesEstudos;

import classesEstudos.onibus.Motorista;
import classesEstudos.onibus.Onibus;
import classesEstudos.onibus.Passageiro;
import classesEstudos.onibus.Viagem;

public class onibusTeste {
    public static void main(String[] args) {
        // Exemplo de uso das classes para criar ônibus, motoristas, passageiros e viagens.
        Onibus onibus1 = new Onibus(1, "Guarabira - João Pessoa - Guarabira");
        Motorista motorista1 = new Motorista("Motorista 1", "12345", 35);
        Passageiro passageiro1 = new Passageiro("Passageiro 1", "98765", 25, false);
        Passageiro passageiro2 = new Passageiro("Passageiro 2", "54321", 65, true);
        Viagem viagem1 = new Viagem("Guarabira", "João Pessoa", motorista1, 20.0, 50);

        viagem1.iniciarViagem();
        viagem1.adicionarPassageiro(passageiro1);
        viagem1.adicionarPassageiro(passageiro2);
        viagem1.finalizarViagem();

        onibus1.adicionarViagem(viagem1);

        System.out.println("Informações da Viagem:");
        System.out.println("Origem: " + viagem1.getOrigem());
        System.out.println("Destino: " + viagem1.getDestino());
        System.out.println("Motorista: " + viagem1.getMotorista().getNome());
        System.out.println("Arrecadação Total: " + viagem1.getArrecadacaoTotal());
    }   
}
