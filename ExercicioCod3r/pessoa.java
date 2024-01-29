package ExercicioCod3r;

public class pessoa {
    
    String nome = null;
    double peso = 0;

    public pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(comida comida){
        this.peso += comida.getPeso();
        System.out.println(nome + " está comendo " + comida.getNome()+" NHam Nham ");
        System.out.println("Novo peso: " + peso);
        
    }

    static void espacoEmbranco(){
        System.out.println();
    }

    public String getNome(){
        return nome;
    }
    public double getPeso(){
        return peso;
    }

    void apresentar(){
        System.out.printf("Olá me chamo %s e tenho %.2f\n",nome, peso);
    }

    String satisfeito(){
        return "Estou satisfeito e mais gordo";
    }

    void pausaDramatica(){
        try {
            // Pausa a execução por 2 segundos (2000 milissegundos)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Lidar com exceções se algo der errado durante a pausa
            e.printStackTrace();
        }

        System.out.println("Fim do programa");
    }

    
    
}
