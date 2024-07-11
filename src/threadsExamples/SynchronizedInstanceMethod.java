package threadsExamples;

class Counters {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class SynchronizedInstanceMethod {
    public static void main(String[] args) throws Exception {
        Counters counter = new Counters();
//        Runnable td = ()->{
//          for (int i=1;i<=1000;i++){
//              counter.increment();
//          }
//        };
//        Thread t1 = new Thread(td);
//        t1.start();
//        t1.join();
//


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    counter.increment();
                }
                //System.out.println(counter.count);
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    counter.increment();
                }
                //System.out.println(counter.count);
            }
        });
        t1.start();
        t2.start();
        t2.join();
        t2.join();
        System.out.println(counter.count);
    }
}
