package ExceptionHandling;

public class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("hello...");
            System.exit(0);
        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("by by");
        }
    }
}
