package src.Polymorphism;


class Bike {
    void speed() {
        System.out.println("Speed 60km/h");
    }
}

class Pulsar extends Bike{

    void speed() {
        System.out.println("Speed 90km/h");
    }
    void color(){
        System.out.println("Red");
    }
}

class Honda extends Bike{
    void color(){
        System.out.println("Gray");
    }
}


class TVs extends Bike{

    void color(){
        System.out.println("Black");
    }

    void speed(){
        super.speed();
        System.out.println("Speed is 20km/h");
    }
}


public class MethodOverriding {

    public static void main(String[] args) {
        Pulsar p=new Pulsar();
        p.speed();
        p.color();
        Honda h=new Honda();
        h.speed();
        h.color();
        TVs tv=new TVs();
        tv.color();
        tv.speed();
    }
}
