package classesEstudos;

public class Produto {
    String nome;
    static Double preco;
    static Double desconto = 0.25;
    
    static Double ComDesconto(){
        return preco * (1 - desconto);
    }

    Double precoComDesconto(Double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
