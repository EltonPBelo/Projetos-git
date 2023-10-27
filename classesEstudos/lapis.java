package classesEstudos;

public class lapis {

    private String modelo;
    private String cor;
    private Double ponta;

    public  lapis(){ // Metodo construtor, todo objeto que eu innstanciar dessa classe vai vir com esse status(configurações)
        this.cor = "Azul";
        this.modelo = "Faber Castell";
        this.ponta = 2.0;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public Double getPonta(){
        return this.ponta;
    }

    public void setPonta(Double p){
        this.ponta = p;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public String getCor(){
        return this.cor;
    }

    public void status(){
        System.out.println(this.getModelo());
        System.out.println(this.getCor());
        System.out.println(this.getPonta());
    }
    
}
