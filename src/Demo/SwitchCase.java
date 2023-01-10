package src.Demo;

public class SwitchCase {

    public static void main(String[] args) {
        String choice="test";

        switch(choice){
            case "test":
                System.out.println("Block 1");
                break;
            case "", "leap":
                System.out.println("Block 2");
                break;

            default:
                System.out.println("Default block");

        }
    }
}
