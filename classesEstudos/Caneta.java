package classesEstudos;

public class Caneta {
    
    public String nome;
    public String cor;
    protected int carga;
    private  Double ponta;
    private boolean tampada;

    public void status(){
        System.out.println("Uma caneta da cor "+ this.cor);
        System.out.println("Está tampada "+ this.tampada);
        System.out.println("Porcentagem da carga "+ this.carga+"%");
    }

    protected void rabiscar(){
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

    public void tampar(){
        this.tampada = true;
    }
        // por mais que tampada seja privada eu não posso mexer com ela fora da classe, no entando na classe eu posso,
        //fazendo com que esse atributo que ta privado posse ser acessado fora dessa classe pois está em um metodo publico, porem eu nao consigo acessar
        // o tampada fora dessa classe
    public void destampar(){ 
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
