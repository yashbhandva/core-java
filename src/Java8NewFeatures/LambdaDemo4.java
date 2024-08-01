package Java8NewFeatures;

public class LambdaDemo4 {

    public static void main(String[] args) {
        Runnable td = () ->{
            for (int i = 1; i < 10; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("i = "+i);
            }
        };
        Thread t1 = new Thread(td);
        t1.start();
    }
}
