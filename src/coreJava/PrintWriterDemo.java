package coreJava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("C:\\Users\\Dell\\Desktop\\xyz\\yash.txt");
        pw.println(6747);
        pw.println("hey this is a PrintWriter");
        pw.close();
        System.out.println("PrintWriter work is all done...");


    }
}
