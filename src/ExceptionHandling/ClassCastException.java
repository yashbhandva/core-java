package ExceptionHandling;

public class ClassCastException {
    public static void main(String[] args) {
//        String s = new String("hello");
//        Object o = (Object) s;
//        System.out.println(o);

        Object o = new Object();
        String s = (String) o;
        System.out.println(s);

        //Object cannot be cast to class
    }
}
