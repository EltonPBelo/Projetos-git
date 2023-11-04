package AtividadePOO;

import java.util.Arrays;

import classesEstudos.onibus;

public class Main {

    public static void main(String[] args) {
   //criando o objeto 'onibusDisponiveis'
   CadastroDeOnibus onibusDisponiveis = new CadastroDeOnibus();
        
   CadastroDeViajens viagensDisponiveis = new CadastroDeViajens();
   
   //fazendo instâncias da classe 'Motorista'
   Motorista motorista00 = new Motorista("João", "000123456789", 29);
   Motorista motorista01 = new Motorista("John", "001123456789", 32);
   Motorista motorista02 = new Motorista("José", "011123456789", 36);
   
    //fazendo instâncias da classe 'Onibus'
   Onibus onibus00 = new Onibus(01, "Guarabira - JoãoPessoa - Guarabira", 22,motorista00);
   Onibus onibus01 = new Onibus(0, null, 0, motorista01);
   Onibus onibus02 = new Onibus(0, null, 0, motorista02);
   
   
   //adicionando os ônibus criados em 'onibusDisponíveis'
   onibusDisponiveis.adicionarNovoOnibus(onibus00);
   onibusDisponiveis.adicionarNovoOnibus(onibus01);
   onibusDisponiveis.adicionarNovoOnibus(onibus02);
   
   //mostrando todos os ônibus disponíveis e suas informações
   onibusDisponiveis.imprimeTodosOsOnibusDisponiveis();
   
   Passageiro passageiro00 = new Passageiro("Maria", "123.123.123", 18);
   Passageiro passageiro01 = new Passageiro("Luiza", "123.333.123", 18);
   Passageiro passageiro02 = new Passageiro("Lucas", "222.123.123", 13);
   
    Viagem viagem00 = new Viagem("Guarabira", "Santa Rita", true, Arrays.asList(passageiro00), motorista00, 12.00, 30, 20, 10, 300.00);
    Viagem viagem01 = new Viagem("Guarabira", "Sape", false, Arrays.asList(passageiro01), motorista01, 15.00, 40, 25, 15, 400.00);
    Viagem viagem02 = new Viagem("Guarabira", "Mari", true, Arrays.asList(passageiro02), motorista02, 11.00, 35, 15, 20, 250.00);

   viagensDisponiveis.adicionarViagem(viagem00);
   viagensDisponiveis.adicionarViagem(viagem01);
   viagensDisponiveis.adicionarViagem(viagem02);
   
   viagensDisponiveis.imprimeTodasAsViagensDisponiveis();
}
}
 