package src.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOrder {

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        int i,j, temp=0;
        int array[]=new int[5];

        for(i=0; i < array.length; i++) {
            System.out.println("Enter the " + (i+1) + " number");
            array[i] = sc.nextInt();

        }


        for(i=0; i < array.length; i++) {
        for( j=i+1; j < array.length; j++) {



        if (array[i] >array[j]) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        }
        }
        System.out.println("Ordered array: " + Arrays.toString(array));

        }

}
