package advanceJava;


record Human(int age,String name){
    public Human{
        if (age > 100)
            throw new ArithmeticException("hey !");

    }
}
public class RecordClass {
    public static void main(String[] args) {
        try {
            Human h1 = new Human(810, "chagan");
            System.out.println(h1);
        }catch (ArithmeticException e){
            System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: hey !\n" +
                    "\tat advanceJava.Human.<init>(RecordClass.java:7)\n" +
                    "\tat advanceJava.RecordClass.main(RecordClass.java:14)");
        }
    }
}
