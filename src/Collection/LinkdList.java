package Collection;

import reStart.Node;

class node{
    int data;
    node next;

    public node(int data) {
        this.data = data;
    }
    public static int funCount(node head){
        int count = 0;
        while (head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void funr(node head){
        node temp = head;
        if (temp==null)
            return;

        System.out.println(temp.data);
        funr(temp.next);
    }
    public node nNthNode(node head, int x){
        node fast = head;
        node slow = head;
        for (int i=1;i<=x;i++){
            fast = fast.next;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void fun(node head){
        node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}

public class LinkdList {
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        node.fun(a);














//        System.out.println();
//        System.out.println();
//        node.funr(a);
//        System.out.println();
//        System.out.println();
//        int result = node.funCount(a);
//        System.out.println(result);

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);
//        System.out.println(a.next.next.next.next.next.data);

//        node temp = a;
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
    }
}