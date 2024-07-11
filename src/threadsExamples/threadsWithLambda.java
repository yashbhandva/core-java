package threadsExamples;


public class threadsWithLambda {
    public static void main(String[] args) {
        Runnable Go =()->{
          for (int i=1;i<=5;i++){
              System.out.println("i = "+i);
              try {
                  Thread.sleep(100);
              }catch (InterruptedException exception){
                  System.out.println();
              }
          }
        };
        Runnable GetLost =()->{
            for (int i=1;i<=5;i++){
                System.out.println("i = "+i);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException exception){
                    System.out.println();
                }
            }
        };
        Thread td = new Thread(Go);
        td.start();
//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException exception){
//
//        }
        Thread td2 = new Thread(GetLost);
        td2.start();
    }
}
