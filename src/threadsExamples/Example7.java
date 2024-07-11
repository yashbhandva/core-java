package threadsExamples;

class Ex7 extends Thread{
    @Override
    public void run() {
        System.out.println("child Thread ");
    }
}
public class Example7 {
    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        Thread t1 = new Thread(ex7);
        t1.start();
        System.out.println("parent Thread ");
    }
}
