package ExceptionHandling;

public class Example4 {
    public static int m1(){
        try {
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
    public static void main(String[] args) {
        Example4 ex4 = new Example4();
        System.out.println(m1());
    }
}
