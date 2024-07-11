package MultithreadingEnhancement;

import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLockDemo1 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.lock();
        System.out.println("the number of holds on this lock is : "+lock.getHoldCount());
        System.out.println("lock is held by the current thread "+lock.isHeldByCurrentThread());
        System.out.println("the number of threads waiting to acquire this lock :"+lock.getQueueLength());

        System.out.println();
        lock.unlock();
        System.out.println("first lock is unlocked");
        System.out.println("the number of holds on this lock is : "+lock.getHoldCount());

        System.out.println();
        lock.unlock();
        System.out.println("second lock is unlocked");
        System.out.println("the number of holds on this lock is : "+lock.getHoldCount());
        System.out.println("lock is held by the current thread "+lock.isHeldByCurrentThread());
        System.out.println("this lock has fairness set "+lock.isFair());
    }
}
