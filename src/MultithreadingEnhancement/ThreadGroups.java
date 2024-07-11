package MultithreadingEnhancement;
class Myt extends Thread{
    Myt(ThreadGroup g,String name){
        super(g,name);
    }

    @Override
    public void run() {
        System.out.println("hello");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }
}
public class ThreadGroups {
    public static void main(String[] args) throws InterruptedException{
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getThreadGroup().getName());
//        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
//
//        ThreadGroup tg = new ThreadGroup("first group");
//        System.out.println("the parent of first group is : "+tg.getParent().getName());
//
//        ThreadGroup t1 = new ThreadGroup(tg,"second group");
//        System.out.println("the parent of second group is : "+t1.getParent().getName());

        ThreadGroup pg = new ThreadGroup("parent");
        ThreadGroup cg = new ThreadGroup(pg,"child");

        Myt t1 = new Myt(pg,"t1");
        Myt t2 = new Myt(pg,"t2");

        t1.start();
        t2.start();
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();

        System.out.println();

        Thread.sleep(3000);
        System.out.println(pg.activeCount());
        pg.activeGroupCount();
        pg.list();
    }
}
