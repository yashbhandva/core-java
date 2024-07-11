package coreJava;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("yash");
        sb.append(" bhandva");
        System.out.println(sb.charAt(0));
        System.out.println(sb);
        System.out.println(sb.deleteCharAt(3));
    }
}
