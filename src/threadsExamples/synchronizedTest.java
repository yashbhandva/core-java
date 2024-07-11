package threadsExamples;

class DisplayNC{
    public synchronized void displayN(){
        for (int i=1;i<=26;i++){
            System.out.print(i+" ");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public synchronized void displayC(char ch){
        for (int i=65;i<=90;i++){
            System.out.print((char) i+" ");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class MyThread1 implements Runnable{
    DisplayNC d;
    MyThread1(DisplayNC d){
        this.d = d;
    }

    @Override
    public void run() {
        d.displayN();
    }
}
class MyThread2 implements Runnable{
    DisplayNC d;
    MyThread2(DisplayNC d){
        this.d = d;
    }

    @Override
    public void run() {
        d.displayC('a');
    }
}
public class synchronizedTest {
    public static void main(String[] args) {
        DisplayNC DNC = new DisplayNC();

        MyThread1 td1 = new MyThread1(DNC);
        Thread t1 = new Thread(td1);

        MyThread2 td2 = new MyThread2(DNC);
        Thread t2 = new Thread(td2);

        t1.start();
        t2.start();
    }
}
