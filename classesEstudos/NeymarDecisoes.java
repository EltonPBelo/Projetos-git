package classesEstudos;
import java.util.Random;
import java.util.Scanner;
public class NeymarDecisoes {

    public String time;
    public int titulos;
    public Double salario;
    public boolean feliz;
    private int placarAfavor = 0;
    private int placarContra = 0;


    public void mudarDeTime(){
        String nomeTime[] = {"Psg","Real Madrid","Manchester City","Flamengo"};
        Random sorteio = new Random();

        // Gere um índice aleatório dentro dos limites do array
        int indiceSorteado = sorteio.nextInt(nomeTime.length);

         // Acesse o elemento correspondente no array
        String timeSorteado = nomeTime[indiceSorteado];

        System.out.println("Você recebeu uma proposta do "+timeSorteado);
        System.out.println("Deseja aceitar?\nDigite 1 para 'aceitar'\nE digite 2 para 'recusar'");
        

       
        
}

               
    

    public void campeao(){
       this.titulos++;
       System.out.println("E ele é campeão\ntitulos da carreira "+ this.titulos);
    }

    public void pausaDramatica(){
        try {
            // Coloque a thread atual para dormir por 1 segundo (1000 milissegundos)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Lidar com exceções, se necessário
        }
    }
    
    public void chutar(){
        Random sorte = new Random();
        Boolean possibilidade = sorte.nextBoolean(); 

        if(possibilidade == true){
            System.out.println("Ajeitou pra perna boa");
            pausaDramatica();
            System.out.println("Cortou o primeiro");
            pausaDramatica();
            System.out.println("Chutou e é GOOOOOOOOOOOOOOOOOLLLLLLLLLLLLLLLLLLLLLLL");
            this.placarAfavor++;
            System.out.println("Placar: "+placarAfavor +" X "+placarContra);
        }

        else{
            System.out.println("Ajeitou pra perna boa");
            pausaDramatica();
            System.out.println("Cortou o primeiro");
            pausaDramatica();
            System.out.println("Chutou e ERROOOOOOUUUUUU");
            System.out.println("Placar: "+this.placarAfavor +" X "+this.placarContra);
        }
    }

}
