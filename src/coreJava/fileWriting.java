package coreJava;

//C:\Users\Dell\Desktop\xyz

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class bufferWriter {
    public void bw() {
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\Desktop\\xyz\\yash.txt"));
            bf.write("hello ji kese he aap...");
            bf.close();
        } catch (Exception ek) {
            System.out.println("hi..." + ek);
        }
    }
   public void bufferReader(){
       try {
           BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\xyz\\yash.txt"));
           String s;
           while ((s = bufferedReader.readLine())!=null){
               System.out.println(s);
           }
           bufferedReader.close();
       }catch (Exception exception){
           System.out.println();
       }
   }
}

public class fileWriting {
    public static void main(String[] args) {
        bufferWriter bff = new bufferWriter();
        bff.bw();
        bff.bufferReader();
    }
}
