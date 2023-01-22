package src.IOPackage;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ByteWiseOperation {

    public static void main(String[] args) throws Exception{
//        Source keyboard
//        Destination console or monitor
        DataInputStream dinput=new DataInputStream(System.in);
        FileOutputStream file=new FileOutputStream("abc.txt");
        int ch;
        System.out.println("Enter text: ");
        while((ch=dinput.read()) !='@'){
                file.write(ch);
        }
        System.out.println("done");

    }
}
