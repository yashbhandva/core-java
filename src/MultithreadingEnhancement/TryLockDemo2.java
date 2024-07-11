package MultithreadingEnhancement;

import java.util.concurrent.locks.ReentrantLock;

class TryLock1 extends Thread{
    static ReentrantLock lock = new ReentrantLock(true);
    static ReentrantLock lock2 = new ReentrantLock();
    TryLock1(String name){
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
        else if (lock2.tryLock()){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }finally {
                lock2.unlock();
            }
        }
        else {
            System.out.println("sut up "+Thread.currentThread().getName());
        }
    }
}
public class TryLockDemo2 {
    public static void main(String[] args) {
        TryLock1 t1 = new TryLock1("first Tread");
        TryLock1 t2 = new TryLock1("second thread");
        TryLock1 t3 = new TryLock1("third thread");

        t1.start();
        t2.start();
        t3.start();
    }
}
