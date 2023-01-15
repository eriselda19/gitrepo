package src.Inheritance;

import java.util.Scanner;

public class Address {

    private String city;
    private String state;
    Scanner sc=new Scanner(System.in);

    void readAdd(){

        System.out.println("Enter city: ");
        city=sc.next();
        System.out.println("Enter state: ");
        state=sc.next();

    }

    void displayAdd(){
        System.out.println("City is: ");
        System.out.println("State is: ");

    }


}
