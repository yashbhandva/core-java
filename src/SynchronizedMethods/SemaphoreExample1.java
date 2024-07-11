package SynchronizedMethods;
import java.util.concurrent.Semaphore;

public class SemaphoreExample1 {
    private final Semaphore semaphore = new Semaphore(1);

    public void accessResource() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " acquired the semaphore");
            // Simulate some work with the shared resource
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " released the semaphore");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        SemaphoreExample1 example = new SemaphoreExample1();

        Thread t1 = new Thread(example::accessResource, "Thread 1");
        Thread t2 = new Thread(example::accessResource, "Thread 2");

        t1.start();
        t2.start();
    }
}
