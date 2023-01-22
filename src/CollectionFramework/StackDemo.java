package src.CollectionFramework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack ss = new Stack();
        ss.push(10);
        ss.push(20);
        ss.push(30);
        ss.push(40);
        ss.push(50);
        System.out.println(ss);

        ss.pop();
        System.out.println(ss);
        System.out.println(ss.peek());
        System.out.println(ss.search(40));
        System.out.println(ss.search(400));
        System.out.println(ss.size());

    }


}
