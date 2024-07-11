package threadsExamples;

class ChildThread implements Runnable{
    static Thread mt;

    @Override
    public void run()  {
        try {
            mt.join(5000);
        } catch (InterruptedException e) {

        }
        for (int i=1;i<=10;i++){
            System.out.println("child thread");
        }
    }
}
public class JoinChildThread {
    public static void main(String[] args) throws InterruptedException{
        ChildThread childThread = new ChildThread();
        Thread t1 = new Thread(childThread);
        ChildThread.mt = Thread.currentThread();
        t1.start();

        for (int i=1;i<=10;i++){
            System.out.println("main thread");
            Thread.sleep(1000);
        }
    }
}
