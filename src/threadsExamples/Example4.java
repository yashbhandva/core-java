package threadsExamples;

class Ex4 implements Runnable {
    private int sum = 0;
    private int n;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            this.notify();
        }
    }

    public int getSum() {
        return sum;
    }

    public void setN(int n) {
        this.n = n;
    }
}

public class Example4 {
    public static void main(String[] args) throws Exception {
        Ex4 ex4 = new Ex4();
        Thread t1 = new Thread(ex4);
        t1.start();
        synchronized (ex4) {
            ex4.setN(50);
            ex4.wait();
            int x = ex4.getSum();
            System.out.println(x);

        }


//        Example4 ex =new Example4();
//        Runnable td = () ->{
//          int sum = 0;
//          for (int i=1;i<=50;i++){
//              sum = sum+i;
//          }
//        };
//        Thread t1 = new Thread(td);
//        t1.start();
//
    }
}
