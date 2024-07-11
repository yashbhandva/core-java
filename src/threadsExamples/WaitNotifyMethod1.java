package threadsExamples;

class MyThread3 implements Runnable {
    int sum;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("child thread starting calculation");
            for (int i = 1; i <= 50; i++) {
                sum = sum + i;
            }
            System.out.println("child thread give notification");
            this.notify();
        }
    }
}

public class WaitNotifyMethod1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 td = new MyThread3();
        Thread t1 = new Thread(td);
        t1.start();
        //Thread.sleep(0,1);
        //t1.join();
        Thread.sleep(5000);// main thread will be never execute
        synchronized (t1) {
            System.out.println("main thread calling wait method ");
            t1.wait(4000);
            System.out.println("main thread got notification ");
            System.out.print("lets main thread start execution");
            System.out.println(" :" + td.sum);
        }
    }
}
