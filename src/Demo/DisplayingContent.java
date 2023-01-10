package src.Demo;

import java.util.Scanner;

public class DisplayingContent {

    public static void main(String[] args) {
//        Factorial program example
//        3!=1*2*3=6

//      Creating scanner object
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
//      Declare variables
        int fact_var=1;
        int n;

//      Reading user input
        n=sc.nextInt();

//      Calculate factorial number with for loop
//        for(int i=1; i<=n;i++){
//            fact_var=fact_var*i;
//            System.out.println("Iterator sequence is: "+ i);
//        }

//        Calculate factorial number with while loop
        int i=1;
        while(i<=n){
            fact_var=fact_var*i;
            i++;
            System.out.println("Iterator sequence is: "+ i);
        }



//      Displaying the factorial
        System.out.println("Factorial of the number " + n + " is: "+ fact_var);
    }


}
