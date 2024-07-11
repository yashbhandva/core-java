package threadsExamples;

class Interruption implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("i am gonna sleep...");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("interruption Thread");
        }
    }
}

public class InterruptionMethod {
    public static void main(String[] args) {
        Interruption it = new Interruption();
        Thread t1 = new Thread(it);
        t1.start();
        t1.interrupt();
        System.out.println("end main thread");
    }
}
