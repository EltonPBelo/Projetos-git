package classesEstudos;

public class VideoAulaTeste {
    public static void main(String[] args) {
        
        VideoAula online = new VideoAula();

        online.DuraçãoAula = 17.00;
        online.nomeCanal = "Curso em video";
        online.materia = "Java POO";
        online.atividade = true;

        online.adiantarAula();// adianta a video aula em 30 segundos
        online.fazerAtividade();// faz a atividade
        
    }
}
