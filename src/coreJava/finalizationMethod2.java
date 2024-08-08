package coreJava;

public class finalizationMethod2 {
    public static void main(String[] args) {
        finalizationMethod t = new finalizationMethod();
        t.finalize();
        t.finalize();

        t = null;
        System.gc();
        System.out.println("end of main");
    }
    public void finalize(){
        System.out.println("finalize method called");
    }
}
