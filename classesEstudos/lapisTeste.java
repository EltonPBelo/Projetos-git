package classesEstudos;

public class lapisTeste {
    public static void main(String[] args) {
        
        //lapis l1 = new lapis();
        lapis l2 = new lapis();

       // l1.setModelo("Faber Castell Black");
       // l1.setPonta(2.0);
        //l1.status();
        //l2.setModelo("Faber Castell Blue Ocean");

        l2.setModelo("Leo e Leo Clack grafiti");
        l2.setPonta(1.0);
        l2.setPonta(2.0);

       //System.out.println(l2.modelo); não funciona pois o modelo é um atributo privado
       System.out.println(l2.getModelo());// funciona pois com o get eu posso acessar esse atributo privado, ele faz tipo uma ponte pra mim,
       //onde eu posso modificar e pegar os valores dos atributos privados
        
        l2.status();
        
        

    }
}
