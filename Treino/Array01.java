package Treino;

import java.util.Arrays;

public class Array01 {
    
public static void main(String[] args) {
    
    int[] a = new int[3];
    a[1] = 7;
    a[2] = 10;
    a[0] = 9;

    System.out.println(a[2]+""+a[0]);

    
    System.out.println(Arrays.toString(a));

    int total = 0;


    for(int i = 0; i < a.length; i++) {

        total += a[i];
        

}

    System.out.println(total/3);

}}
