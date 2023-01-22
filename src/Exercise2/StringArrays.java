package src.Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrays {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String names[]=new String[5];
        int i=0;

        for(i =0 ; i<names.length;i++){

            System.out.println("Enter the " + (i+1)+ " name: ");
            names[i]=sc.next();
        }

        System.out.println("Array of names:" + Arrays.toString(names));
    }
}
