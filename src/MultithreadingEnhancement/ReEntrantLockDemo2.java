package MultithreadingEnhancement;

import java.util.concurrent.locks.ReentrantLock;
    /* Note -->
    * If comments line one and two then the threads will be executed simultaneously
    *  and we will get irregular output if we are not comment line one and two then
    *  the threads will be executed one by one and we will get regular output*/
class Display{
    ReentrantLock lock = new ReentrantLock();
    public void wish(String name){
        lock.lock(); //-> line one
        for (int i = 1; i < 11; i++) {
            System.out.print("good morning :");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(name);
        }
        lock.unlock(); //-> line two
    }
}
class MyClass implements Runnable{
    Display d;
    String name;
    MyClass(Display d,String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
public class ReEntrantLockDemo2 {
    public static void main(String[] args) {
        Display d = new Display();
        MyClass td = new MyClass(d,"jack");
        MyClass td1 = new MyClass(d,"oggy");

        Thread t1 = new Thread(td);
        Thread t2 = new Thread(td1);

        t1.start();
        t2.start();
    }
}
