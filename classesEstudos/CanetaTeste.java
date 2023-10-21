package classesEstudos;

public class CanetaTeste {
    public static void main(String[] args) {
        
         Caneta c1 = new Caneta();
         c1.nome = "Caneta bic";
         c1.cor ="Azul";
         c1.tampada = true;
         c1.ponta = 0.50;
         c1.carga = 84;

         //vai exibir o estatus do meu objeto c1
         c1.status();

    }
}
