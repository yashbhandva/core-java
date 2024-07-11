package threadsExamples;

class Demon implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("child thread");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
public class DaemonDemo {
    public static void main(String[] args) {
        Demon td = new Demon();
        Thread t1 = new Thread(td);
        t1.setDaemon(true);
        t1.start();
        System.out.println("End main thread !!");
    }
}
