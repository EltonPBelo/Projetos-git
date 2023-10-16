package classesEstudos;

public class ProdutoTeste {

    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 5321.99;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "caneta";
        p2.preco = 10.25;
        p2.desconto = 0.10;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        Double precoFinal1 = p1.ComDesconto();//utilizando a função criada na classe produto pra calcularr o desconto
       Double precoFinal2 = p2.precoComDesconto(0.10);// Se fossemos usar a função com o desconto do gerente
        System.out.printf("%.2f\n",precoFinal1);
        System.out.printf("%.2f",precoFinal2);

    }
}