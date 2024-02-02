package Arrays;

public class AprendendoArray {
    public static void main(String[] args) {
        

        String[] diasDaSemana = new String[7];

        diasDaSemana[0] = "Domingo";
        diasDaSemana[1] = "Segunda";
        diasDaSemana[2] = "Terça";
        diasDaSemana[3] = "Quarta";
        diasDaSemana[4] = "Quinta";
        diasDaSemana[5] = "Sexta";
        diasDaSemana[6] = "Sábado";

        System.out.println(diasDaSemana); //é o endereco de memoria de onde esse array está
        System.out.println(diasDaSemana[6]);
        System.out.println(diasDaSemana.length);

        for(int i = 0; i < diasDaSemana.length ; i++){
            System.out.println(diasDaSemana[i]);
        }

        int v = 10;
        int[] a = new int[10];

        for(int i = 0; i < a.length; i++){
            a[i] = v += 1;

        }
System.out.println("FOReach");
        for(int as : a){
            System.out.println(as);
        }




    }
}
