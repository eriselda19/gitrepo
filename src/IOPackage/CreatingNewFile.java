package src.IOPackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingNewFile {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the file name to be created: ");
        String fileName=sc.next();
        String filePath="/Users/shehaje/Desktop/all_files/"+fileName;
        File ff=new File(filePath);

        if(ff.exists()){
            System.out.println("A file with this name is already existing");
        }else {
            ff.createNewFile();
            System.out.println("A new file with the name " + ff.getName() + " is created");
        }
    }
}
