package coreJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class copyFiles{
    public void files(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\Desktop\\xyz\\yash-copy.txt"));
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\xyz\\yash.txt"));
            String s;
            while ((s = br.readLine()) != null){
                bw.write(s);
            }
            br.close();
            bw.close();
        }catch (Exception exception){
            System.out.println();
        }
    }
}
public class CopyFile {
    public static void main(String[] args) {
        copyFiles copyFile = new copyFiles();
        copyFile.files();
    }
}
