package coreJava;
class basics{
    public void St(){
        String s = "madara";
        s+=" uchiha";
        s+= 'G';
        s+=10;
        System.out.println(s);
    }
    public void St2(){
        String s = "hello";
        String x = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(x);
    }
}
public class StringBasicMethods {
    public static void main(String[] args) {
        String s = "madara  ";
        /*(1)*/ System.out.println(s.charAt(2));
        /*(2)*/ System.out.println(s+"uchiha");
        /*(3)*/ System.out.println(s.equals("madara"));
        /*(4)*/ System.out.println(s.equalsIgnoreCase("MADARA"));
        /*(5)*/ System.out.println(s.substring(2));
        /*(6)*/ System.out.println(s.substring(2,4));
        /*(7)*/ System.out.println(s.length());
        /*(8)*/ System.out.println(s.replace('d','m'));
        /*(9)*/ System.out.println(s.toLowerCase());
        /*(10)*/ System.out.println(s.toUpperCase());
        /*(11)*/ System.out.println(s.trim());
        /*(12)*/ System.out.println(s.indent(0));
        System.out.println();
        System.out.println("madara"+10+20);
        System.out.println(10+20+"madara");
        basics b = new basics();
        b.St();
        b.St2();
    }
}
