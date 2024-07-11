package threadsExamples;
class MyThreadD extends Thread{

}
public class DaemonThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        //Thread.currentThread().setDaemon(true);//IllegalThreadStateException
        Thread t1 = new Thread();
        System.out.println(t1.isDaemon());//false
        t1.setDaemon(true);
        System.out.println(t1.isDaemon());//true
    }
}
