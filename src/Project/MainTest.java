package src.Project;

import java.util.Scanner;

public class MainTest {

    public static void welcomeScreen(){
        Developer dev =new Developer("Java Application", "Eriselda Shehaj");

        System.out.println("Welcome" + "\n" + dev.getDevName() + " into " + dev.getAppName() + " program\n");

    }

    public static void getUserOptions() throws Exception {
        UserDetails u1 = new UserDetails();
        Scanner sc =new Scanner(System.in);
        int option;
        System.out.println("Select from above options which one you want to perform: ");
        System.out.println("1. Sort file in Ascending Order");
        System.out.println("2. Perform business level operations");
        System.out.println("3. Exit the application");

        option=sc.nextInt();

        switch(option){
            case 1:
                u1.fileAscendingOrder();
                break;
            case 2:
                int busOpt;

                System.out.println("Enter your choice for Business Level Operations");
                System.out.println("1. Add a new file");
                System.out.println("2. Delete a file");
                System.out.println("3. Search file");
                System.out.println("4. Close the current execution context and return to the main context");
                busOpt=sc.nextInt();

                switch (busOpt){
                    case 1:
                        u1.addFileToDirectory();
                        break;
                    case 2:
                        u1.deleteFileInDirectory();
                        break;
                    case 3:
                        u1.searchFileInDirectory();
                        break;
                    case 4:
                        System.out.println("Exit from the context of Business Level Operations\n");
                        break;
                    default:
                        System.out.println("The selected option doesn't exist");
                        break;

                }
            case 3:
                System.out.println("Exiting the application");
                break;
            default:
                System.out.println("The selected option does not exist");
        }
    }


    public static void main(String[] args) throws Exception {

        welcomeScreen();
        getUserOptions();


    }
}
