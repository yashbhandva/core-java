package threadsExamples;

class Ex1 extends Thread{
    @Override
    public void run() {
        System.out.println("hello java world :)");
    }
}
class Exp1 implements Runnable{
    @Override
    public void run() {
        System.out.println("hello yash :)");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Runnable e1 = new Exp1();
        Thread t1 = new Thread(e1);
        t1.start();

        Ex1 t2 = new Ex1();
        t2.start();
    }
}
