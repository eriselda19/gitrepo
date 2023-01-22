package src.Project;

public class MainTest {

    public static void main(String[] args) throws Exception {
        Developer dev =new Developer("Java Application", "Eriselda Shehaj");

        System.out.println("Welcome" + "\n" + dev.getDevName() + " into " + dev.getAppName() + " program\n");

        UserDetails u1=new UserDetails();
        u1.fileAscendingOrder();
//        u1.addFileToDirectory();
//
//        u1.deleteFileInDirectory();

    }
}
