package src.Polymorphism;

class Operation{

    void add(int x, int y){
        System.out.println(x+y);
    }
    void add(int x, int y,int z){
        System.out.println(x+y+z);
    }

    void add(String x, String y){
        System.out.println(x+y);
    }
}

class OperationDetails {
    void area(int r) {

    }
    void area(int b, int l) {

    }
}


public class MethodOverloading {

    public static void main(String[] args) {
        Operation op=new Operation();
        op.add(1,4,6);
        op.add(1, 2);
        op.add("1", "2");
    }
}
