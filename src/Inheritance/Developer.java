package src.Inheritance;

public class Developer extends Employee{

    private String projectTechnology;

    void readDeveloper(){
        System.out.println("Enter the projectTechnology: ");
        projectTechnology=sc.next();
    }

    void displayDeveloper(){
        System.out.println("projectTechnology is: " + projectTechnology);

    }
}
