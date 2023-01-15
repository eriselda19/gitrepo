package src.NonAccessSpecifiersExamples;


class Abc{
    int a;
    static int b;
    void display1(){
        System.out.println("Non static method or instance method");
    }

    static void display2(){
        System.out.println("Static method");
    }
}
public class StaticDemo {
    public static void main(String[] args) {

        Abc obj=new Abc();
//        Calling through classname
        Abc.display2();
//        Calling through object
        obj.display2();

        obj.a=100;
        System.out.println(obj.a);
        Abc.b=200;
        System.out.println(Abc.b);
        obj.b=300;
        System.out.println(obj.b);




    }
}
