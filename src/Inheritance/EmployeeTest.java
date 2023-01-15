package src.Inheritance;

public class EmployeeTest {

    public static void main(String[] args) {
        Manager m1= new Manager();
        System.out.println("Please enter manager details:");
        m1.readEmployee();
        m1.readManager();

        m1.displayEmployee();;
        m1.displayManager();

        Developer d1 =new Developer();
        System.out.println("Developer details");
        d1.readDeveloper();
        d1.displayDeveloper();
    }
}
