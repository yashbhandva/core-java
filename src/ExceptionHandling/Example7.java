package ExceptionHandling;

public class Example7 {
    static ArithmeticException e = new ArithmeticException();
    static NullPointerException n;
    public static void main(String[] args) {
        throw n;
    }
}
