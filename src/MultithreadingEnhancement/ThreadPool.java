package MultithreadingEnhancement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class printJob implements Runnable {
    String name;

    printJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " start job..." + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " complete his job..." + Thread.currentThread().getName());
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        printJob[] jobs = {
                new printJob("mahesh"),
                new printJob("jack"),
                new printJob("john"),
                new printJob("tony")
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (printJob job : jobs){
            service.submit(job);
        }
        service.shutdown();
    }
}
