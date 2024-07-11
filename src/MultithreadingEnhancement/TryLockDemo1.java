package MultithreadingEnhancement;

import java.util.concurrent.locks.ReentrantLock;

class TryLockDemo extends Thread{
    static ReentrantLock lock = new ReentrantLock();
    TryLockDemo(String name){
        super(name);
    }

    @Override
    public void run() {
        if (lock.tryLock()){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }finally {
                lock.unlock();
            }
        }
        else {
            System.out.println("go way : "+Thread.currentThread().getName());
        }
    }
}
public class TryLockDemo1 {
    public static void main(String[] args) {
    TryLockDemo t1 = new TryLockDemo("first Tread");
    TryLockDemo t2 = new TryLockDemo("second thread");

    t1.start();
    t2.start();
    }
}
