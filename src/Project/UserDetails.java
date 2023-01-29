package src.Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserDetails implements UserInterface {

    Scanner sc = new Scanner(System.in);

    //  Create a helper method to give you the list of files inside "all_files" folder
    public List<String> getAllFiles() {

        List<String> stringList = new ArrayList<>();
        String filePath = "/Users/shehaje/Desktop/all_files/";
        File folder = new File(filePath);
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            stringList.add(listOfFiles[i].getName());

        }
        return stringList;

    }
//    Use getAllFiles() method to give you the list of files inside of all_files folder and sort them

    @Override
    public void fileAscendingOrder() {

        List<String> stringList = new ArrayList<>();
        stringList = getAllFiles();

        System.out.println("List of files before sorting: ");
        System.out.println(stringList + "\n");

        System.out.println("After sorting - Ascending order");
        Collections.sort(stringList);
        System.out.println(stringList);

    }

    @Override
    public void addFileToDirectory() throws IOException {

        System.out.println("Please enter the file name to be created: ");
        //  Ignore the case sensitivity of the file names
        String fileName = sc.next().toLowerCase();
        String filePath = "/Users/shehaje/Desktop/all_files/" + fileName;
        File ff = new File(filePath);
        if (ff.exists()) {
            System.out.println("A file with this name is already existing");
        } else {
            FileWriter file = new FileWriter(filePath);
            System.out.println("Add text inside your newly created file ");
            String text = sc.next();
            file.write(text + fileName);
            file.flush();
            System.out.println("A new file with the name " + ff.getName() + " is created");
        }

    }

    //    Add the case sensitivity on the file name
//    Return a message if FNF (File not found)
    @Override
    public void deleteFileInDirectory(){

        System.out.println("Enter the file name to be deleted");
        String fileName = sc.next();
        String filePath = "/Users/shehaje/Desktop/all_files/" + fileName;
        File ff = new File(filePath);
        if (ff.exists()) {
            ff.delete();
            System.out.println("The file " + filePath + " has been deleted");
        } else {
            System.out.println("A file with this name " + fileName + " does not exist");
        }

    }

    //  Add the case sensitivity on the file name to retrieve the correct file
//  Display the result upon successful operation
//  Display the result upon unsuccessful operation
    @Override
    public void searchFileInDirectory(){

        List<String> stringList = new ArrayList<>();
        stringList = getAllFiles();
        System.out.println("Enter the file name to search: ");
        String fileName = sc.next();
        if (stringList.contains(fileName)) {
            System.out.println("The file " + fileName + " is inside of the folder");

        } else {
            System.out.println("The file doesn't exist");

        }
        stringList.toString();
    }

}
