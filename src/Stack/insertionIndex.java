package Stack;

import java.util.Stack;

public class insertionIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int idx = 1;
        int val = 2;
        Stack<Integer> temp = new Stack<>();
        while (st.size()>idx){
            int x = st.peek();
            temp.push(x);
            st.pop();
        }
        System.out.println(temp);
        st.push(val);
        while (temp.size()>0){
            int x = temp.peek();
            st.push(x);
            temp.pop();
        }
        System.out.println(st);
    }
}
