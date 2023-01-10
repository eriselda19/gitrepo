package src.Demo;

public class TypeCasting {

    public static void main(String[] args) {
        byte a =100;
        short b =a;
//        implicit casting
        System.out.println(a);
        System.out.println(b);
//        explicit casting
        short c= 120;
        byte d= (byte) c;
        System.out.println(c);
        System.out.println(d);

//        implicit casting
        int m=100;
        float n=m;
        System.out.println(m);
        System.out.println(n);
//        explicit casting
        float o =100;
        int p = (int) o;

        System.out.println(o);
        System.out.println(p);

    }
}
