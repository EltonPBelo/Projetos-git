package classesEstudos;

public class Data {

    int dia;
    String mes;
    int ano;

    Data(int Dia,String mesA,int ano1) {
        dia = Dia;
        mes = mesA;
        ano = ano1;
    }

    Data(){
    //int dia = 1;
    //String mes = "1";
    //int ano = 1970;
    this(10,"julho", 2000);

    }

    String obterDataFormatda (){
        return dia+"/"+ mes + "/" + ano;// comom eu estou mexendo com uma string eu posso incrementar testos e simbolos e etc /
        /*Que nesse caso vai ficar todos os dados formatados do jeito certo pois eu lhes coverti para uma string */
    }

    
    
    //pode ser feito dessa maneira tambem
    String obterDataFormatada2 (){
        return String.format("%s/%s/%s", dia,mes,ano);// é a mesma coisa do exemplo acima porem formato usando o .format() que é uma função para as Strings    
    }
    
}
