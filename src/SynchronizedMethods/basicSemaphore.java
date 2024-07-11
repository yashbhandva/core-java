package SynchronizedMethods;

import java.util.concurrent.Semaphore;

public class basicSemaphore {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);
        semaphore.acquire(3);
        semaphore.release(4);
        System.out.println(semaphore.availablePermits());
    }
}
