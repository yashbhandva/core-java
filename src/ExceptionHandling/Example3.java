package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
//C:\Users\Dell\Desktop\xyz
public class Example3 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            new PrintWriter("C:\\Users\\Dell\\Desktop\\xyz\\yas.txt");
            pw.println("hello");
        }catch (FileNotFoundException e){
            System.out.println("C:\\Users\\Dell\\Desktop\\xyz\\t1.txt");
                pw.println("hi");
        }catch (Exception e){
            System.out.println(" exception");
        }
        finally {
           if (pw!=null){
               pw.close();
           }
        }
    }
}
