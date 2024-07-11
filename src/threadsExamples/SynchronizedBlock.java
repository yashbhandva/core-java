package threadsExamples;

class TestDemo {
    public void wish(String name) {
        ;
        ;
        ;
        ;
        ;
        ;//100k line od code
        synchronized (TestDemo.class) {
            // synchronized(this) lock of corrent object lock
            // synchronized(.class) class level lock
            for (int i = 1; i <= 10; i++) {
                System.out.print("good morning ");
                try {
                    Thread.sleep(600);
                } catch (InterruptedException exception) {
                    System.out.println(exception.getMessage());
                }
                System.out.println(name);
            }
        }
        ;
        ;
        ;
        ;
        ;
        ;//200k line of code
    }
}

class DemoThread implements Runnable {
    TestDemo td;
    String name;

    DemoThread(TestDemo td, String name) {
        this.td = td;
        this.name = name;
    }

    @Override
    public void run() {
        td.wish(name);
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        DemoThread td = new DemoThread(testDemo, " naruto");
        DemoThread td1 = new DemoThread(testDemo, " hinata");

        Thread t1 = new Thread(td);
        Thread t2 = new Thread(td1);

        t1.start();
        t2.start();
    }
}
