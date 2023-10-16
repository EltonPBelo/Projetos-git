package classesEstudos;

public class Produto {
    String nome;
    Double preco;
    Double desconto;
    
    Double ComDesconto(){
        return preco * (1 - desconto);
    }

    Double precoComDesconto(Double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
