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

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERROR Impossivel rabiscar pois a caneta está tampada");
        }
        else{
            System.out.println("Rabiscando...");
            this.pausar();
            System.out.println("Rabiscando....");
            this.pausar();
            System.out.println("rabiscando........");
            this.pausar();
            System.out.println("Opa um desenho foi formado");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void pausar(){
        try {
            // Coloque a thread atual para dormir por 1 segundo (1000 milissegundos)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Lidar com exceções, se necessário
        }
    }
}
