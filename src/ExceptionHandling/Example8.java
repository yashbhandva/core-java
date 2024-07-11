package ExceptionHandling;

public class Example8 {
    public static void main(String[] args) throws InterruptedException{
        doStuf();
    }
    public static void doStuf() throws InterruptedException{
        doMoreStuf();
    }
    public static void doMoreStuf() throws InterruptedException{
        Thread.sleep(1000);
    }
}
