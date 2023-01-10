package src.Demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BasicJavaProgramV2 {


    public static void main(String[] args) {
        int num1, num2;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        num2=sc.nextInt();
        System.out.println("Arithmetic operations");
        System.out.println("Addition of the numbers is: " + (num1+num2));
        System.out.println("Subtraction of the numbers is: " + (num1-num2));
        System.out.println("Multiplication of the numbers is: " + (num1*num2));
        System.out.println("Division of the numbers is: " + (num2 / num1));
        System.out.println("Modulo of the numbers is: " + (num1 % num2));
    }
}
