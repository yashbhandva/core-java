package coreJava;

public class arraysTest {
    public static void main(String[] args) {
        Object[] x = new Object[5];
        x[0] = "yash";
        x[1] = 12;
        x[2] = 12.73;
        x[3] = true;
        x[4] = 12.12;
        for (Object y:x){
            System.out.println(y);
        }
    }
}
