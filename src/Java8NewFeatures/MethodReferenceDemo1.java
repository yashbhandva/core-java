package Java8NewFeatures;

class abc{
    public void M1(){
        for (int i = 0; i < 11; i++) {
            System.out.println("i = "+i);
        }
    }
}
public class MethodReferenceDemo1 {
    public static void main(String[] args) {
        abc a = new abc();
        Runnable td = a::M1;
        Thread t1 = new Thread(td);
        t1.start();
        for (int i = 100; i < 111; i++) {
            System.out.println("i = "+i);
        }
    }
}
