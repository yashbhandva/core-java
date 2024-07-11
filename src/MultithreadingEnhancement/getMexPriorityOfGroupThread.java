package MultithreadingEnhancement;

public class getMexPriorityOfGroupThread {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("demo group");
        Thread t1 = new Thread(tg,"thread-1");
        Thread t2 = new Thread(tg,"thread-2");

        tg.setMaxPriority(3);

        Thread t3 = new Thread(tg,"thread-3");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
}
