package coreJava;

public class ThrowOwnClass {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
         try {
             j = 9/11;
             if (j==0){
                 throw new ArithmeticException("can not dived by zero...");
             }
         }catch (ArithmeticException exception){
             System.out.println(9/1);
                 System.out.println("this is a default output!");
         }
        System.out.println(j);
    }
}
