package threadsExamples;

import java.io.*;

//C:\Users\Dell\Desktop\xyz
//class BufferedWriters extends Thread {
//    @Override
//    public void run() {
//        try {
//            BufferedWriter bf = new BufferedWriter(
//                    new FileWriter("C:\\Users\\Dell\\Desktop\\xyz\\t1.txt"));
//            bf.write("hello");
//            bf.close();
//        } catch (Exception e) {
//            System.out.println("hi");
//        }
//    }
//}
//class BufferedReaders implements Runnable{
//    @Override
//    public void run() {
//        try {
//            BufferedReader bf = new BufferedReader(
//                    new FileReader("C:\\Users\\Dell\\Desktop\\xyz\\t1.txt"));
//            String s;
//            while ((s = bf.readLine()) != null){
//                System.out.println(s);
//            }
//            bf.close();
//
//        }catch (IOException e){
//            System.out.println();
//        }
//    }
//}
public class Example3 {
    public static void main(String[] args) {
       Thread t1 = new Thread();

       t1.start();


       Runnable td = () ->{
           try {
               BufferedReader bf = new BufferedReader(
                       new FileReader("C:\\Users\\Dell\\Desktop\\xyz\\t1.txt"));
               String s;
               while ((s = bf.readLine()) != null){
                   System.out.println(s);
               }
               bf.close();

           }catch (IOException e){
               System.out.println();
           }
       };
       Thread t2 = new Thread(td);
       t2.start();
    }
}
