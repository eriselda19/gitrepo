package src.Java_OOPS;

class Sample{
    Sample(){
        System.out.println("Constructor started.... a new object was created");
    }

    void display() {
        System.out.println("this is display method part of sample class");
    }
    String sayHello() {
        return "Welcome user ";
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {
        Sample s= new Sample();
        s.display();
        s.sayHello();

    }
}
