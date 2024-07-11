package threadsExamples;

public class SleepMethod {
    public static void main(String[] args) {
        Runnable td =  ()->{
          for (int i=1;i<=10;i++){
              System.out.println("slide - "+i);
              try {
                  Thread.sleep(5000);
              }catch (InterruptedException e){

              }
          }
        };
        Thread t1 = new Thread(td);
        t1.start();
    }
}
