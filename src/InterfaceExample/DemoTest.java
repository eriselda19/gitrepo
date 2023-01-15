package src.InterfaceExample;

interface Abc{
    int A=10;
//    A method can be only declared without a body inside of the interfaces
    void display1();
}

interface Xyz {
    int B=20;
    void display2();
}

class Test implements Abc,Xyz{


    @Override
    public void display1() {
        System.out.println("Abc interface display1 method");

    }

    @Override
    public void display2() {
        System.out.println("Abc interface display2 method");
    }
}

public class DemoTest {

    public static void main(String[] args) {
        Test tt = new Test();
        tt.display1();
        tt.display2();
    }
}
