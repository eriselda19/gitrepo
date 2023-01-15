package src.Demo;

import java.util.Scanner;

public class KeyboardInputs {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the id: ");
//        Scan integer
        int id= sc.nextInt();

        System.out.println("Id is: " + id);
        System.out.println("Enter the name: ");
//        Scan strings
        String name =sc.next();
        System.out.println("Name is: " + name);

    }
}
