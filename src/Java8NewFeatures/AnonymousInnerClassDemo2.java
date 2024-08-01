package Java8NewFeatures;

public class AnonymousInnerClassDemo2 {
    public static void main(String[] args) {
        Runnable td = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 11; i++) {
                    System.out.println("Runnable interface method = "+i);
                }
            }
        };
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 11; i++) {
                    System.out.println("Thread class method "+i);
                }
            }
        };
        for (int i = 0; i < 11; i++) {
            System.out.println("main Thread method "+i++);
        }
        Thread t2 = new Thread(td);
        t1.start();
        t2.start();
    }
}
