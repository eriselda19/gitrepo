package src.NonAccessSpecifiersExamples;


abstract class Bike {
    abstract void speed();
}

abstract class Pulsar extends Bike {
    abstract void mailage();
    void color() {
        System.out.println("Red");
    }
}
class SuperPulsar extends Pulsar {
    void speed() {
        System.out.println("120km/hr");
    }
    void mailage() {
        System.out.println("20km/lt");
    }
}


public class AbstractExamples {
    public static void main(String[] args) {
//        Bike is abstract class so we cannot create new objects from that class
//            Bike b=new Bike();

        SuperPulsar sp =new SuperPulsar();
        sp.color();
        sp.mailage();
        sp.speed();
    }
}
