package Queues;

import java.util.Stack;

class QueueWithSt{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void add(int x){
        stack1.push(x);
    }
    public int pek(){
        while (stack1.size()>1){
            int x = stack1.peek();
            stack2.push(x);
            stack1.pop();
        }
        while (stack2.size()>0){
            int x = stack2.peek();
            stack1.push(x);
            stack2.pop();
        }
        return stack1.peek();
    }

}

public class queueUsingStacks {
    public static void main(String[] args) {
        QueueWithSt LL = new QueueWithSt();
        LL.add(3);
        LL.add(35);
        LL.add(357);
        LL.add(34);
        LL.add(342);

        System.out.println(LL.pek());
    }
}
