package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparatorEX1 implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        return i2.compareTo(i1);
    }
}
public class PriorityQueuesDemo2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(15,new MyComparatorEX1());
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.offer(7);
        q.offer(8);

        System.out.println(q);

    }
}
//note :- Some platforms can't provide proper support for thread priority and priority queue