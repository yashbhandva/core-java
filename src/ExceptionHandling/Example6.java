package ExceptionHandling;

public class Example6 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("hello");
                System.out.println(10/0);
            }catch (NullPointerException e){
                System.out.println("inner try catch block...");
            }
        }catch (Exception e){
            System.out.println("outer try catch block...");
        }
        System.out.println("nothing...");
    }
}
