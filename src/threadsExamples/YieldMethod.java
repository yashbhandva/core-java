package threadsExamples;

class YieldDemo implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("child : "+i);
            Thread.yield();
        }
    }
}
public class YieldMethod {
    public static void main(String[] args) {
        YieldDemo yieldDemo = new YieldDemo();
        Thread t1 = new Thread(yieldDemo);
        t1.start();

        for (int i=1;i<=10;i++){
            System.out.println("parent : "+i);
        }
    }
}
