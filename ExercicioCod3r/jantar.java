package ExercicioCod3r;

public class jantar {
    //Aqui vai ter o método Main
    public static void main(String[] args) {
        
        comida c1 = new comida("lasanha",0.800);
        comida c2 = new comida("Arroz", 0.300);

        pessoa p1 = new pessoa("Neymar", 70.0);
        p1.apresentar();
        pessoa.espacoEmbranco();
        p1.comer(c1);
        pessoa.espacoEmbranco();
        p1.comer(c2);
        pessoa.espacoEmbranco();
        p1.comer(c2);
        pessoa.espacoEmbranco();
        p1.comer(c2);
        pessoa.espacoEmbranco();

        //p1.pausaDramatica();
        p1.apresentar();
        System.out.println(p1.satisfeito());


    }
}
