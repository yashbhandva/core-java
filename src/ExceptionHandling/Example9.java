package ExceptionHandling;

import java.util.Scanner;

class toOldException extends RuntimeException{
    toOldException(String massage){
        super(massage);
    }
}
class toYongException extends RuntimeException{
    toYongException(String massage){
        super(massage);
    }
}
public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try {
           System.out.print("enter your age : ");
           int age = sc.nextInt();
           if (age>60){
               throw new toYongException("you aer so yong please try next time for best match!!1");
           } else if (age>=0 && age<18) {
               throw new toOldException("your age is out of bound try in another birth!!!");
           }else System.out.println("thanks for log in this side");
       }catch (toYongException | toOldException e){
           e.printStackTrace();
       }
       catch (NumberFormatException e){
           System.out.println(e.getMessage());
       }
    }
}
