package src.NonAccessSpecifiersExamples;

class Info {
    int a;
    static int b;
    void dis() {
        int a=1000;
        int b=2000;
        System.out.println("a local "+a);
        System.out.println("a "+this.a);		// instance variable
        System.out.println("b "+b);
        System.out.println("b "+Info.b);     // static variable
    }
}

public class StaticAnotherExample {
    static int b;
    public static void main(String[] args) {

        int a;
        Info obj1=new Info();
        Info obj2=new Info();
        obj1.a=100;
        Info.b=200;
        obj1.b=300;
        obj2.a=400;
        Info.b=500;
        obj2.b=600;

        obj1.dis();
        obj2.dis();

    }
}
