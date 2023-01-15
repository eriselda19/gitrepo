package src.Inheritance;

public class Manager extends Employee{

    private int numberofEmpl;

    Address add =new Address();

    void readManager(){
        System.out.println("Enter the number of employees working under him: ");
        numberofEmpl=sc.nextInt();
        add.readAdd();
    }

    void displayManager(){
        System.out.println("Number of employees working under him: " + numberofEmpl);
        add.displayAdd();

    }

}
