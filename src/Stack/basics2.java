package Stack;

import java.util.Stack;

public class basics2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        Stack <Integer> stack = new Stack<>();
        while (st.size()>0){
            int x = st.peek();
            stack.push(x);
            st.pop();
        }
        //System.out.println(stack);

        Stack<Integer> gt = new Stack<>();
        while (stack.size()>0){
            int x = stack.peek();
            gt.push(x);
            stack.pop();
        }
        System.out.println(gt);
    }
}
