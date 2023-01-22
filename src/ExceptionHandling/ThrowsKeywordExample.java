package src.ExceptionHandling;


import java.util.Scanner;

class VoteException extends Exception{
    public VoteException() {

    }

    public VoteException(String msg) {
        super(msg);    // passing this message to Exception super class parameterized constructor to set the value.
    }
}

public class ThrowsKeywordExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age");
        int age=sc.nextInt();

        try{
            if(age>=18){
                System.out.println("You can vote");
            }else {
                throw new VoteException("age must be be >=21");
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }

    }
}
