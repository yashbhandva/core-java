package threadsExamples;

class Demo implements Runnable {
    synchronized public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
    class Demo2 extends Thread{
        public void run(){
            for (int i=1;i<= 15;i++){
                System.out.println("i = "+i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException exception){

                }
            }
        }
    }
public class Example2 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Main");
        System.out.println(Thread.currentThread().getName());

        Runnable td = new Demo();
        Thread t1 = new Thread(td);
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getName());
        t1.setName("demo");
        t1.start();

        Demo2 t2 = new Demo2();
        t1.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t2.getName());
        t1.setName("demo2");
        t2.start();

    }
}
