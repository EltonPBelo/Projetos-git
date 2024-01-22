package ExercicioCod3r;

public class comida{

String nome;
double peso;

comida(String nome, double peso){
    this.nome = nome;
    this.peso = peso;
    System.out.println("");
   
}

public double getPeso(){
    return peso;
}

public String getNome(){
    return nome;
}

}