package threadsExamples;

class Ex8 implements Runnable{
    @Override
    public void run() {
        for (int i = 1;i <= 10; i++){
            System.out.println("child Thread...");
        }
    }
}
public class Example8 {
    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        Thread t1 = new Thread(ex8);
        t1.setPriority(10);
        t1.start();

        for (int i = 1;i <= 10; i++){
            System.out.println("parent Thread...");
        }
        System.out.println("the main thread priority is : "+Thread.currentThread().getPriority());
        System.out.println("the run method priority is : "+t1.getPriority());
    }
}
