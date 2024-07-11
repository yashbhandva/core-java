package threadsExamples;
//over loaded run method
class Ex6 extends Thread{
    @Override
    public void run() {
        System.out.println("no-args");
    }
    public void run(int i){
        System.out.println("int-args");
    }
}
public class Example6 {
    public static void main(String[] args) {
        Ex6 ex6 = new Ex6();
        ex6.start();
    }
}
