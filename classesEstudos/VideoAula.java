package classesEstudos;

public class VideoAula {
    
    String nomeCanal;
    String materia;
    Double DuraçãoAula;// pegar o valor double e converter para String em um metodo(pois o user vai poder skpipar o video )(skipa o valor double e converter para String)
    boolean atividade;

    void pausaDramaticaTrehad(){
        try {
            // Coloque a thread atual para dormir por 1 segundo (1000 milissegundos)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Lidar com exceções, se necessário
        }
    }

    //metodo para adiantar a aula
    void adiantarAula(){
       Double skip = DuraçãoAula - 0.30;
       System.out.println("30 Segundos da aula adiantado, tempo restante de aula: "+skip+" De "+ this.DuraçãoAula+" minutos");

    }

    //metodo para fazer a atividade
    void fazerAtividade(){
        if(atividade == true){
            System.out.println("Fazendo atividade...");
            pausaDramaticaTrehad();
            System.out.println("Fazendo atividade.....");
            pausaDramaticaTrehad();
            System.out.println("Fazendo atividade.........");
            pausaDramaticaTrehad();
            System.out.println("Atividade concluida");
            this.atividade = false;
                       
        }

        else{
         System.out.println("Professor não passou atividade, hora de descansar entâo");
        }
    }
    


}
