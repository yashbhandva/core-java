package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

class stacks{
    Queue<Integer> Que;
    public void push(int x){
        Que = new LinkedBlockingQueue<>();
            Que.add(x);
            for (int i=1;i<Que.size()-1;i++){
                int val = Que.remove();
                Que.add(val);
            }
        }
    public int peeks(){
        return Que.peek();
    }
    public int pop(){
        return Que.remove();
    }
    public void display2(){
        for (int e:Que){
            System.out.println(e);
        }
    }
}
public class stackUsingQueuePushOn {
    public static void main(String[] args) {
        stacks st = new stacks();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.display2();
    }
}
