package threadsExamples;
class Counter{
    static int count = 0;
    public static synchronized void increment(){
        count++;
    }
}
class A extends Counter implements Runnable{
    @Override
    public  void run() {
        for (int i=1;i<=50000;i++){
            increment();
        }
    }
}
class B extends Counter implements Runnable{
    @Override
    public  void run() {
        for (int i=1;i<=50000;i++){
            increment();
        }
    }
}
public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        Example5 example5 = new Example5();
        B b = new B();
        Thread t1 = new Thread(b);

        A a = new A();
        Thread t2 = new Thread(a);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("the total num of count is : "+b.count);

    }
}
