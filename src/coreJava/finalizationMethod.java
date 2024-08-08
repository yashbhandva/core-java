package coreJava;

public class finalizationMethod {
    public static void main(String[] args) {
        finalizationMethod s = new finalizationMethod();
        //String s = new String("yash"); // Create a new String object
        s = null; // Make the String object eligible for garbage collection
        System.gc(); // Suggest garbage collection
        System.out.println("end of main");
    }

    @Override
    protected void finalize() { // Override the finalize method
        System.out.println("finalized method called");
    }
}
