package src.Demo;
import java.util.Scanner;
public class QuizProgram {

    public static void main(String[] args) {
        //  Created scanner object
        Scanner sc =new Scanner(System.in);
        //  Declaring variables
        int n;
        //  Displaying the set of quiz options
        System.out.println("Who is the founder of Blue Origin? ");
        System.out.println("1. Bill Gates\n2. Tim Cook\n3. Nadella\n4. Jeff Bezos\n5. Exit");
        System.out.println("Enter your choice(1/2/3/4/5)?: ");
        //  Reading input from user
        n=sc.nextInt();
        //  Validating answer
        if(n==4){
            System.out.println("Congratulation !! You have guessed the correct answer");
        }else{
            System.out.println("Wrong choice. Please try again!");
        }

    }
}
