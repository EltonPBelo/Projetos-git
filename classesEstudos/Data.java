package classesEstudos;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(int dia,int mes,int ano) {
        this.dia = dia;// o this. é usado para difenciar o atributo de instancia do atributo de metodo
        this.mes = mes;
        this.ano = ano;
    }

    Data(){
    //int dia = 1;
    //String mes = "1";
    //int ano = 1970;
    //this(10,07, 2000);

    }

    String obterDataFormatda (){
        return dia+"/"+ mes + "/" + ano;// comom eu estou mexendo com uma string eu posso incrementar testos e simbolos e etc /
        /*Que nesse caso vai ficar todos os dados formatados do jeito certo pois eu lhes coverti para uma string */
    }
    String DataFormatada2(){
        String formato = "%d/%d/%d"; // Variavel local, só pode ser acessada dentro do método
        return String.format(formato,dia,mes,ano);// Variavel local, só pode ser acessada dentro do método

    
    }

    
    
    //pode ser feito dessa maneira tambem
    String obterDataFormatada2 (){
        return String.format("%s/%s/%s", dia,mes,ano);// é a mesma coisa do exemplo acima porem formato usando o .format() que é uma função para as Strings    
    }
    
}
