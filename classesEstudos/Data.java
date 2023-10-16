package classesEstudos;

public class Data {

    int dia;
    String mes;
    int ano;

    String obterDataFormatda (){
        return dia+"/"+ mes + "/" + ano;// comom eu estou mexendo com uma string eu posso incrementar testos e simbolos e etc /
        /*Que nesse caso vai ficar todos os dados formatados do jeito certo pois eu lhes coverti para uma string */
    }

    
    
    //pode ser feito dessa maneira tambem
    String obterDataFormatada2 (){
        return String.format("%s/%s/%s", dia,mes,ano);// é a mesma coisa do exemplo acima porem formato usando o .format() que é uma função para as Strings    
    }
    
}
