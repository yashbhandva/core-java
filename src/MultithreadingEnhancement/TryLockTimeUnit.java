package MultithreadingEnhancement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread {
    static ReentrantLock lock = new ReentrantLock();
    MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        do {
            try {
                if (lock.tryLock(2,TimeUnit.SECONDS)){
                    System.out.println(Thread.currentThread().getName()+" got a lock");
                    Thread.sleep(10000);
                    System.out.println(Thread.currentThread().getName()+" release the lock");
                    lock.unlock();
                    break;
                }
                else {
                    System.out.println("sut up "+Thread.currentThread().getName());
                }
            }catch (InterruptedException exception){
                System.out.println("i am a useless !!");
            }
        }while (true);
    }
}
public class TryLockTimeUnit {
    public static void main(String[] args) {
    MyThread t1 = new MyThread("first thread");
    MyThread t2 = new MyThread("second thread");
    MyThread t3 = new MyThread("third thread");

    t1.start();
    t2.start();
    t3.start();
    }
}
