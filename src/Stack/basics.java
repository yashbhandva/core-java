package Stack;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);//insert values in stack
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);

//        for (int n : st){
//            System.out.println(n);
//        }
        System.out.println(st);
        System.out.println( st.pop()); //delete yop elements

        System.out.println(st.peek()); // print the top elements

        System.out.println("size is : "+st.size()); //print the size of array
    }
}
