package Queues;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedBlockingQueue<>();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);

        System.out.println(q);
        Queue<Integer> qu = new LinkedBlockingQueue<>();
        while (q.size()>0){
            int x = q.peek();
            qu.add(x);
            q.remove();
            System.out.print(x+" ");
        }
        while (qu.size()>0){
            int x = qu.peek();
            q.add(x);
            qu.remove();
        }
    }
}
