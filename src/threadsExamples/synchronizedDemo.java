package threadsExamples;

class Display{
   public static synchronized void wish (String name){
       for (int i=1;i<=10;i++){
           System.out.print("good morning");
           try {
               Thread.sleep(2000);
           }catch (InterruptedException e){

           }
           System.out.println(name);
       }
   }
}
class MyThread implements Runnable{
    Display d;
    String name;

     MyThread (Display d,String name){
         this.d = d;
         this.name = name;
     }

     public void run(){
         d.wish(name);
     }
}
public class synchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
      Display display = new Display();
      Display display1 = new Display();
      MyThread td = new MyThread(display," oggy");
      Thread t1 = new Thread(td);

      MyThread td1 = new MyThread(display1," jack");
      Thread t2 = new Thread(td1);

      t1.start();
      t2.start();
    }
}
