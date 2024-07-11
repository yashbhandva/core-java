package coreJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReaders {
    @Override
    public String toString() {
        return "fileReaders{}";
    }

    public static void main(String[] args) {
        try {

            BufferedReader bf = new BufferedReader( new FileReader("C:\\Users\\Dell\\Desktop\\xyz//output.txt"));
            String s;
            while ((s= bf.readLine())!=null){
                System.out.println(s);
            }
            bf.close();
        }catch (IOException exception){
            return;
        }
    }
}
