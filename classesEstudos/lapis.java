package classesEstudos;

public class lapis {

    public String modelo;
    public String cor;
    private Double ponta;

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

    public void status(){
        System.out.println(this.modelo);
        System.out.println(this.ponta);
    }
    
}
