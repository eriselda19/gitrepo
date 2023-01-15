package src.Java_OOPS;

public class EmployeeTest {


    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.println(e1.salary);
//        System.out.println(e1.id);
        System.out.println(e1.name);

        Employee e2 =new Employee(123,"Defined", 6000);
        System.out.println(e1.salary);
//        System.out.println(e1.id);
        System.out.println(e1.name);

        e2.setId(4);
        System.out.println(e1.getId());
    }
}
