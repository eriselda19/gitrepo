package src.Exercise4;

public class Employee {

    int id;
    String name;
    float salary;

    Employee(int id, String name, float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    void calculateSalary(){

        int hra, da, pf;
//        salary = salary+ 10% hra(salary + 5% da – 7% pf);
        System.out.println("Salary: " + salary);
    }

    void dispalyEmployeeInfo(){
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee name: " + salary);

    }
}
