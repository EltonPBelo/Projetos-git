package classesEstudos;

public class ProdutoTeste {

    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        Produto.preco = 5321.99;
        Produto.desconto = 0.25;


        System.out.println(p1.nome);

    Double precoFinal1 = p1.ComDesconto();//utilizando a função criada na classe produto pra calcularr o desconto
// Se fossemos usar a função com o desconto do gerente
        System.out.printf("%.2f\n",precoFinal1);
   
    }
}