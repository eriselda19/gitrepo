package src.Java_OOPS;

import java.util.Formatter;

public class Employee {

    private int id;
    String name;
    float salary;
//    Empty constructor
    public Employee(){
        id=123;
        name="Unknown";
        salary=8000;

    }

    public Employee(int id, String name, float salary){
        this.id= id;
        this.name=name;
        this.salary=salary;

    }

    void setId(int id){
        this.id=id;
    }
    int getId(){
       return id;
    }

}
