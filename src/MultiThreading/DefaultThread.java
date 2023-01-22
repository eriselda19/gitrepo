package src.MultiThreading;

public class DefaultThread {

    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t);
        String name=t.getName();
        int i=t.getPriority();
        ThreadGroup tg =t.getThreadGroup();
        System.out.println(name);
        System.out.println(i);
        System.out.println(tg.getName());
        t.setName("DemoThread");
        System.out.println(t.getName());
        t.setPriority(1);
        System.out.println(t.getPriority());
        System.out.println(tg.getMaxPriority());
        System.out.println(tg.getParent());

    }
}
