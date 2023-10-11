package classesEstudos;

public class TelevisãoTeste {
    public static void main(String[] args) {
        
        Televisão tv = new Televisão();



        System.out.println(tv.ligada);
        tv.canal = 10;
        tv.ligada = true;
        tv.volume = 50;

        System.out.println("A televisão está ligada: "+tv.ligada);
        System.out.println(tv.canal);
        System.out.println(tv.volume);
        System.out.println(tv.canal+10);
    }
    
}
