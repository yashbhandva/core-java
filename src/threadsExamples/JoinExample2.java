package threadsExamples;


class JoinEx2 implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("Seeta is sleeping!!! ");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }
    }
}
public class JoinExample2 {
    public static void main(String[] args) throws InterruptedException{
        Runnable joinEx1 = new JoinEx1();
        Thread t1 = new Thread(joinEx1);
        t1.start();
        t1.join(10000);
        for (int i=1;i<=10;i++){
            System.out.println("am is waiting...");
        }
    }
}
