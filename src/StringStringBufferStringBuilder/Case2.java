//Differance between == operator and .equals Method in java

package StringStringBufferStringBuilder;

public class Case2 {
    public static void main(String[] args) {
        String s1 = new String("vijay");
        String s2 = new String("vijay");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();

        StringBuffer sb1 = new StringBuffer("vijay");
        StringBuffer sb2 = new StringBuffer("vijay");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
    }
}
/* -->  The == operator is used to compare primitives and object references.

*  -->  The .equals() method is used to compare the contents or state of two
*  objects for logical equality. This method is defined in the Object class
*  and can be overridden in user-defined classes.*/