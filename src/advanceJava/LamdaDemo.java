package advanceJava;

public class LamdaDemo {
    public static void main(String[] args) {
        Runnable y1 = ()->{
          for (int  i=1;i<=10;i++){
              System.out.println("hello");
          }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread y = new Thread(y1);
        y.start();

    }
}
