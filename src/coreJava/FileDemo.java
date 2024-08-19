package coreJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Dell\\Desktop\\xyz\\abc.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());
    }
}
