package src.Demo;

public class ArrayMemoryExample {

    public static void main(String[] args) {
//        Allocate array memory
        int num[]=new int[10];
        int temp=10;
//        Assign values to all array indexes
        System.out.println("Assign the value");
        for(int i =0; i< num.length; i++){
            num[i]=temp++;
        }
//        Print all array values
        System.out.println("Display the value");
        for(int n:num){
            System.out.println(n);
        }
    }
}
