package src.IOPackage;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the file name to be deleted");
        String fileName=sc.next();
        String filePath="/Users/shehaje/Desktop/all_files/"+fileName;
        File ff =new File(filePath);
        if(ff.exists()){
            ff.delete();
            System.out.println("The file "+ filePath +  " has been deleted");
        }else{
            System.out.println("A file with this name " + fileName + " does not exist");
        }

    }
}
