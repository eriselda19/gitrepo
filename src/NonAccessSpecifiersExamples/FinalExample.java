package src.NonAccessSpecifiersExamples;



final class A {
    final void dis1() {
        System.out.println("A class method");
    }

}
//We cannot extend final classes

//class B extends A{
//	@Override
//	void dis1() {
//		System.out.println("B class method override");
//	}
//}
public class FinalExample {

    public static void main(String[] args) {

        final int A=100;
        System.out.println(A);
//        you cannot reassign new values to final variables
//        A=200;
        A obj=new A();
        obj.dis1();

    }


}
