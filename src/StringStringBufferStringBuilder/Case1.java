package StringStringBufferStringBuilder;

public class Case1 {
    public static void main(String[] args) {
        String s = new String("vijay");  //
        s.concat(" bhandva");              // --> String is immutable
        System.out.println(s);                //

        System.out.println();

        StringBuffer sb = new StringBuffer("kanji");  //
        sb.append(" bhandva");                       // --> StringBuffer is mutable
        System.out.println(sb);                     //
    }
}
