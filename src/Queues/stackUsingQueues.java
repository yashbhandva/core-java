package Queues;

import java.util.Queue;
import java.util.LinkedList;

class StackQ{
    private Queue<Integer> queue1;
    //private Queue<Integer> queue2;

    public StackQ() {
        queue1 = new LinkedList<>();
        //queue2 = new LinkedList<>();
    }
    public void push(int x){
        queue1.add(x);
    }
    public void display(){
        System.out.print("[");
        while (queue1.size()>0){
            int x = queue1.peek();
            System.out.print(x+" ");
            queue1.remove();
        }
        System.out.print("]");
    }
    public int peekS(){
        for (int i=1;i<=queue1.size()-1;i++){
            int x = queue1.remove();
            queue1.add(x);
        }
        int x = queue1.peek();
        int val = queue1.remove();
        queue1.add(val);
        return x;
    }
    public int pop(){
        for (int i=1;i<=queue1.size()-1;i++){
            int x = queue1.remove();
            queue1.add(x);
        }
        int x = queue1.peek();
        queue1.remove();
        return x;
    }
    public boolean isEmpty(){
        if (queue1.size()==0)return true;
        else return false;
    }
}
public class stackUsingQueues {
    public static void main(String[] args) {
        StackQ Q = new StackQ();
        System.out.println(Q.isEmpty());

        Q.push(5);
        Q.push(6);
        Q.push(7);
        Q.push(8);
        Q.push(9);
        System.out.println(Q.peekS());
        System.out.println(Q.peekS());
        Q.pop();
        System.out.println(Q.isEmpty());
        Q.display();
    }
}
