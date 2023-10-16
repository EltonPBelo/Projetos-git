package classesEstudos;

import java.util.Scanner;

public class AmericanasTeste {
    public static void main(String[] args) {
        
        Scanner coletarDados = new Scanner(System.in);

        Americanas produtos = new Americanas();

        //informaçãoes do produto

        produtos.eletronico = "Iphone 15";
        produtos.preco = 8000.0;
        produtos.desconto = 0.05;

        Double produtoFinal = produtos.preco - (produtos.preco * produtos.desconto);

        System.out.println(produtos.eletronico);
        System.out.println("Valor do produto "+produtos.preco);
        System.out.println("Valor do desconto "+produtos.precoComDesconto());// definir no meu metodo(função) quais dados ele vai coletar e oque fazer com ele

        
        System.out.printf("O seu %s ficou por %.2f\n", produtos.eletronico, produtoFinal);

        // vai armazenar sim || nao 
        System.out.println("Deseja parcelar:  ");
        String parcelamento = coletarDados.nextLine();


        //vai armazenar a quantidade de percelamento
        System.out.println("Em quantas vezes deseja parcelar, parcelamos em até 12x com juros no parcelamento de 8x "); 
        int respostaParcelamento = coletarDados.nextInt();

        if (parcelamento.equalsIgnoreCase("sim") && respostaParcelamento >1 && respostaParcelamento < 12) {
            Double cartao = produtoFinal/respostaParcelamento;
            System.out.printf("O valor a ser paga do seu %s por mês por um total de %d meses é de %.2f",produtos.eletronico,respostaParcelamento, cartao);       
        }

        
        else if(parcelamento.equalsIgnoreCase("nao") || parcelamento.equalsIgnoreCase("não")){
            System.out.println("compra á vista efetuada com sucesso");
        }

        
            
                while (respostaParcelamento > 12 || respostaParcelamento < 1){
                System.out.println("Você digitou um valor indisponivél de parcelamento tente de novo");
                respostaParcelamento = coletarDados.nextInt();

                if(respostaParcelamento <= 12){
                Double cartao = produtoFinal/respostaParcelamento;
                System.out.printf("O valor a ser paga do seu %s por mês por um total de %d meses é de %.2f",produtos.eletronico,respostaParcelamento, cartao);
                }
            }



        coletarDados.close();
    }
}

//if(respostaParcelamento > 12 || respostaParcelamento < 1){}
//do {
//respostaParcelamento = coletarDados.nextInt();
//Double cartao = produtoFinal/respostaParcelamento;
//System.out.printf("O valor a ser paga do seu %s por mês por um total de %d meses é de %.2f",produtos.eletronico,respostaParcelamento, cartao);
//} while (respostaParcelamento > 12 || respostaParcelamento < 1);