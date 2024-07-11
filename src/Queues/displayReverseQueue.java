package Queues;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class displayReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedBlockingQueue<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);

        Stack<Integer> st = new Stack<>();
        while (qu.size()>0){
            int x = qu.peek();
            st.push(x);
            qu.remove();
        }
        System.out.println(st);
        while (st.size()>0){
            int x = st.peek();
            qu.add(x);
            st.pop();
        }
        System.out.println(qu);
    }
}
