package coreJava;
//C:\Users\Dell\Desktop\xyz
import java.io.BufferedReader;
import java.io.FileReader;

class Demo{
    public void bfr(String fileName)throws Exception{
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        String s;
        while ((s = bf.readLine())!=null){
            System.out.println(s);
        }
        bf.close();
    }
}
public class excptionreadFile {
    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            try {
                demo.bfr("C:\\Users\\Dell\\Desktop\\xyz\\t1");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }catch (Exception e){
            System.out.println("by by");
        }
    }
}
