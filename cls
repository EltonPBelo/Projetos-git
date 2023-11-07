[1mdiff --git a/AprendizadoEmJava b/AprendizadoEmJava[m
[1m--- a/AprendizadoEmJava[m
[1m+++ b/AprendizadoEmJava[m
[36m@@ -1 +1 @@[m
[31m-Subproject commit 6fe909fd65ad2710d846ba94e39bd443411a8237[m
[32m+[m[32mSubproject commit 6fe909fd65ad2710d846ba94e39bd443411a8237-dirty[m
[1mdiff --git a/classesEstudos/Carro.java b/classesEstudos/Carro.java[m
[1mindex d4a5e90..d566728 100644[m
[1m--- a/classesEstudos/Carro.java[m
[1m+++ b/classesEstudos/Carro.java[m
[36m@@ -10,6 +10,8 @@[m [mprivate String nomeVeiculo;[m
 private String AnoFabricacao;[m
 private Double Fipe;[m
 private boolean Motor;[m
[32m+[m[32mprivate int velocimetro;[m
[32m+[m[32mprivate int velocidadeMaxima = 200;[m
 [m
 [m
 public void setNomeCarro(String nomeCarro){[m
[36m@@ -57,5 +59,36 @@[m [mpublic void InformacaoCarro(){[m
 [m
 }[m
 [m
[32m+[m[32mpublic boolean LigarCarro(){[m
[32m+[m[32m    return this.Motor = true;[m
[32m+[m[32m}[m
[32m+[m[32mpublic boolean DesligarCarro(){[m
[32m+[m[32m    return this.Motor = false;[m
[32m+[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mpublic void acelerarCarro (){[m
[32m+[m[32m    if (Motor == false) {[m
[32m+[m[32m        System.out.println("impossivel acelerar, o carro está desligado!");[m
[32m+[m[32m    }[m
[32m+[m[32m    else if(Motor == true){[m[41m [m
[32m+[m[32m        this.velocimetro += 10;[m
[32m+[m[32m        System.out.println("Aceleraandoo........\n A velocidade do carro está há "+velocimetro+" KM/H");[m
[32m+[m[32m        if (velocimetro >= velocidadeMaxima) {// se a minha velocidade for menor que a velocidade[m
[32m+[m[32m            velocimetro = velocidadeMaxima; // Limita a velocidade máxima[m
[32m+[m[32m            System.out.println("Velocidade máxima atingida: " + velocidadeMaxima + " KM/H");[m
[32m+[m[32m        } else {[m
[32m+[m[32m            System.out.println("Carro acelerado! Velocidade atual: " + velocimetro + " KM/H");[m
[32m+[m[32m        }[m
[32m+[m[32m    } else {[m
[32m+[m[32m        System.out.println("Velocidade máxima atingida: " + velocidadeMaxima + " KM/H");[m
[32m+[m[32m    }[m
[32m+[m[32m    }[m
[32m+[m[41m    [m
 [m
 }[m
[41m+[m
[41m+[m
[41m+[m
[41m+[m
[41m+[m
[1mdiff --git a/classesEstudos/CarroTeste.java b/classesEstudos/CarroTeste.java[m
[1mindex f60c343..5f13fb0 100644[m
[1m--- a/classesEstudos/CarroTeste.java[m
[1m+++ b/classesEstudos/CarroTeste.java[m
[36m@@ -18,6 +18,9 @@[m [mpublic class CarroTeste {[m
         //Vai imprimir o valor do meu ipva[m
         System.out.println(v1.CalcularIpva(0.04)+"R$");[m
         System.out.println(v1.getNomeCarro());[m
[32m+[m[32m        v1.LigarCarro();[m
[32m+[m[32m        v1.acelerarCarro();[m
[32m+[m
 [m
 [m
     }[m
[1mdiff --git a/classesEstudos/onibus.java b/classesEstudos/onibus.java[m
[1mdeleted file mode 100644[m
[1mindex e5f7cac..0000000[m
[1m--- a/classesEstudos/onibus.java[m
[1m+++ /dev/null[m
[36m@@ -1,50 +0,0 @@[m
[31m-package classesEstudos;[m
[31m-import java.util.ArrayList;[m
[31m-import java.util.List;[m
[31m-[m
[31m-public class onibus {[m
[31m-    [m
[31m-    class Motorista {[m
[31m-        private String nome;[m
[31m-        private String numeroHabilitacao;[m
[31m-        private int idade;[m
[31m-    [m
[31m-        // Construtor, getters e setters[m
[31m-    }[m
[31m-[m
[31m-        public void setMotorista(String nome, String numeroHabilitacao, int id){[m
[31m-            this.nome = nome;[m
[31m-        }[m
[31m-    class Passageiro {[m
[31m-        private String nome;[m
[31m-        private String registroIdentidade;[m
[31m-        private int idade;[m
[31m-        private boolean meiaEntrada;[m
[31m-    [m
[31m-        // Construtor, getters e setters[m
[31m-    }[m
[31m-    [m
[31m-    class Viagem {[m
[31m-        private String origem;[m
[31m-        private String destino;[m
[31m-        private boolean emDeslocamento;[m
[31m-        private List<Passageiro> passageiros = new ArrayList<>();[m
[31m-        private Motorista motorista;[m
[31m-        private double valorPassagem;[m
[31m-        private int capacidadeOnibus;[m
[31m-        private int passageirosInteiros;[m
[31m-        private int passageirosMeiaEntrada;[m
[31m-        private double totalArrecadado;[m
[31m-    [m
[31m-        // Construtor, métodos para iniciar, finalizar a viagem, adicionar passageiros, calcular arrecadação, etc.[m
[31m-    }[m
[31m-    [m
[31m-    class Onibus {[m
[31m-        private int numeroOnibus;[m
[31m-        private String trajeto;[m
[31m-        private List<Viagem> viagens = new ArrayList();[m
[31m-    [m
[31m-        // Construtor, métodos para adicionar viagens, obter informações do ônibus, etc.[m
[31m-    }[m
[31m-     [m
[31m-}[m
[1mdiff --git a/classesEstudos/onibusTeste.java b/classesEstudos/onibusTeste.java[m
[1mdeleted file mode 100644[m
[1mindex d8ccd69..0000000[m
[1m--- a/classesEstudos/onibusTeste.java[m
[1m+++ /dev/null[m
[36m@@ -1,30 +0,0 @@[m
[31m-package classesEstudos;[m
[31m-[m
[31m-import classesEstudos.onibus.Motorista;[m
[31m-import classesEstudos.onibus.Onibus;[m
[31m-import classesEstudos.onibus.Passageiro;[m
[31m-import classesEstudos.onibus.Viagem;[m
[31m-[m
[31m-public class onibusTeste {[m
[31m-    public static void main(String[] args) {[m
[31m-        // Exemplo de uso das classes para criar ônibus, motoristas, passageiros e viagens.[m
[31m-        Onibus onibus1 = new Onibus(1, "Guarabira - João Pessoa - Guarabira");[m
[31m-        Motorista motorista1 = new Motorista("Motorista 1", "12345", 35);[m
[31m-        Passageiro passageiro1 = new Passageiro("Passageiro 1", "98765", 25, false);[m
[31m-        Passageiro passageiro2 = new Passageiro("Passageiro 2", "54321", 65, true);[m
[31m-        Viagem viagem1 = new Viagem("Guarabira", "João Pessoa", motorista1, 20.0, 50);[m
[31m-[m
[31m-        viagem1.iniciarViagem();[m
[31m-        viagem1.adicionarPassageiro(passageiro1);[m
[31m-        viagem1.adicionarPassageiro(passageiro2);[m
[31m-        viagem1.finalizarViagem();[m
[31m-[m
[31m-        onibus1.adicionarViagem(viagem1);[m
[31m-[m
[31m-        System.out.println("Informações da Viagem:");[m
[31m-        System.out.println("Origem: " + viagem1.getOrigem());[m
[31m-        System.out.println("Destino: " + viagem1.getDestino());[m
[31m-        System.out.println("Motorista: " + viagem1.getMotorista().getNome());[m
[31m-        System.out.println("Arrecadação Total: " + viagem1.getArrecadacaoTotal());[m
[31m-    }   [m
[31m-}[m
