package Java8NewFeatures;

public class LamdaDemo9 {
    interface Inter{
        public int mul(int x);
    }

    public static void main(String[] args) {
        Inter i = (x)-> x*x;
        System.out.println(i.mul(10));
    }
}
