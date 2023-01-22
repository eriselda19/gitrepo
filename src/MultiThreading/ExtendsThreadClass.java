package src.MultiThreading;

class A extends Thread{

}


class B extends Thread{

}


public class ExtendsThreadClass {

    public static void main(String[] args) {

        A obj1=new A();
        B obj2=new B();
// Thread ready to run
        obj1.start();
        obj2.start();

    }
}
