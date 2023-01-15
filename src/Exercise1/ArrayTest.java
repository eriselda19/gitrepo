package src.Exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int array[]=new int[5];
        int sum=0;
        int sumOdd=0;
        int sumEven=0;
        for(int i =0; i<array.length;i++){
            System.out.println("Enter the "+ (i+1) + " element:");
            int val=sc.nextInt();
            array[i]=val;
            sum += array[i];

            if(val % 2 == 0){
                sumOdd+=val;

            }else
                sumEven+=val;

        }

        System.out.println("Sum of odd numbers: "+ sumOdd);
        System.out.println("Sum of even numbers: "+ sumEven);
        System.out.println("Sum of all numbers is: " + sum);
        System.out.println("Array values: " + Arrays.toString(array));







    }
}
