package ExceptionHandling;

public class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println("stm 1");
            System.out.println(18/0);
            System.out.println("stm 2");
        }catch (ArithmeticException exception){

            try {
                System.out.println(10/0);
            }catch (ArithmeticException exception1){
                System.out.println(18/1);


                exception.printStackTrace();
                //System.out.println(exception.toString());
                System.out.println(exception.getMessage());
            }
        }
        System.out.println("by by");
    }
}
