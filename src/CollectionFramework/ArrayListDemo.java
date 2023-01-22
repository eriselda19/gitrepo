package src.CollectionFramework;


import java.util.ArrayList;
class A {}
class B {}

public class ArrayListDemo {

    public static void main(String[] args) {

// You can declare an arraylist without defining the size
        ArrayList arrayList=new ArrayList();
        System.out.println(arrayList.size());

        arrayList.add(10);
        System.out.println(arrayList.get(0));
        arrayList.add(10.10);
        arrayList.add("Ravi");
        arrayList.add(true);
        A obj1 = new A();
        arrayList.add(obj1);
        B obj2 = new B();
        arrayList.add(obj2);
        System.out.println("Size "+arrayList.size());
        System.out.println(arrayList);


        ArrayList a2 = new ArrayList<>();
        System.out.println(a2.size());
        System.out.println("Empty "+a2.isEmpty());
        a2.add(10);
        a2.add(30);
        a2.add(20);
        a2.add(50);
        a2.add(60);
        System.out.println(a2);
        System.out.println(a2.size());
        System.out.println("Empty "+a2.isEmpty());
        System.out.println("get value using index "+a2.get(1));
        a2.add(1,100);
        System.out.println("get value using index "+a2.get(1));
        System.out.println(a2);
        a2.remove(2);
        Integer n = 50;
        a2.remove(n);
        System.out.println(a2);
        System.out.println("Search "+a2.contains(10));
        System.out.println("Search "+a2.contains(1000));

        a2.clear();
        System.out.println(a2.size());
    }
}
