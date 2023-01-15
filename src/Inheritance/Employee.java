package src.Inheritance;

import java.util.Scanner;

public class Employee {

    private int id;
    private String name;
    private float salary;
    Scanner sc =new Scanner(System.in);

    void readEmployee(){
        System.out.println("Enter the id: ");
        int id=sc.nextInt();
        System.out.println("Enter name: ");
        String name=sc.next();
        System.out.println("Enter salary: ");
        float salary=sc.nextFloat();

    }

    void displayEmployee(){
        System.out.println("id is: " + id);
        System.out.println("name is: " + name);
        System.out.println("salary is: " + salary);
    }
}
