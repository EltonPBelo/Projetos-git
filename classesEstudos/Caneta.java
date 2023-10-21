package classesEstudos;

public class Caneta {
    
    String nome;
    String cor;
    int carga;
    Double ponta;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta da cor "+ this.cor);
        System.out.println("Está tampada "+ this.tampada);
        System.out.println("Porcentagem da carga "+ this.carga+"%");
    }

    void rabiscar(){}

    void tampar(){}

    void destampar(){}
}
