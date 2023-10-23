package classesEstudos;

public class CanetaTeste {
    public static void main(String[] args) {
        
         Caneta c1 = new Caneta();
         c1.nome = "Caneta bic";
         c1.cor ="Azul";
         //c1.tampada = true;
        // c1.ponta = 0.50;
         c1.carga = 84;// So me permitiu o acesso pois eu estou usando a classe caneta na criação do objeto

         //vai exibir o estatus do meu objeto c1
         //c1.status();
         c1.destampar();
         c1.rabiscar();

         Caneta c2 = new Caneta();
         c2.nome = "Caneta faber castel";
         c2.cor = "preta";
         //c2.tampada = true;
         //c2.ponta = 1.0;
         c2.carga = 54;

         c2.status();
         c2.tampar();
         c2.rabiscar();

    }
}
