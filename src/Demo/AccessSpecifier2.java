package src.Demo;

public class AccessSpecifier2 {

    public static void main(String[] args) {
        System.out.println("Using access modifier");
        AccessModifiersdef obj=new AccessModifiersdef();
        obj.display();
        AccessModifiersPrivate obj2=new AccessModifiersPrivate();
//        display method is private and cannot be accessed
//        obj2.display();
    }
}
