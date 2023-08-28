public class CondicoesTernarias {
    public static void main(String[] args) {
        int nota = 4;

        //Vai analisar a nota e vai dizer se está aprovado ou não, nesse caso está reprovado
        String resultado = nota >= 7 ? "Aprovado" : (nota >= 5 && nota < 7 ? "Recuperação" :  "Reprovado");

        System.out.println(resultado);

    }
    
}
