package Java8NewFeatures;

public class LengthOfString {
    public interface show {
        int len(String s);
    }

    public static void main(String[] args) {
        show l = s->s.length();
        System.out.println(l.len("hello"));
    }
}
