package MultithreadingEnhancement;

import java.util.concurrent.*;

class PrintJobs implements Callable<Integer> {
    private int num;

    PrintJobs(int num) {
        this.num = num;
    }

    @Override
    public Integer call() {
        int sum = num;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        return sum;
    }
}

public class ThreadPool2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        PrintJobs[] jobs = {
                new PrintJobs(2),
                new PrintJobs(3)
        };
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (PrintJobs job : jobs) {
            Future<Integer> future = service.submit(job);
            System.out.println("Result: " + future.get());
        }
        service.shutdown();
    }
}
