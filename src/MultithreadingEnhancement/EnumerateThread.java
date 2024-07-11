package MultithreadingEnhancement;

public class EnumerateThread {
    public static void main(String[] args) {
        ThreadGroup x = Thread.currentThread().getThreadGroup().getParent();
        Thread[] y = new Thread[x.activeCount()];
        x.enumerate(y);
        for (Thread t1 : y){
            System.out.println(t1.getName()+"..."+t1.isDaemon());
        }
    }
}
