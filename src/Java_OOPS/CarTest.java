package src.Java_OOPS;

public class CarTest {

    public static void main(String[] args) {
        Car c=new Car();
        c.start();

        Car bmw=new Car();
        c.appliedGear();

        c.color="blue";
        c.price=12;
        c.wheel=4;

        System.out.println(c.color);
    }
}
