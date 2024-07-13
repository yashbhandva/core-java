package Collection;


import java.util.PriorityQueue;

public class PriorityQueuesDemo {
    public static void main(String[] args) {
       PriorityQueue <Integer> q = new PriorityQueue<>();
        System.out.println(q.poll()); //-->null
        System.out.println();
        //System.out.println(q.remove());--> NoSuchElementException

        for (int i=1;i<=10;i++){
            q.offer(i);
        }
        System.out.println(q);
        System.out.println("head element is : "+q.poll());
        System.out.println(q);
    }
}
