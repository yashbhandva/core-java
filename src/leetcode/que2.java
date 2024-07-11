package leetcode;

class nNthNode{
    Node head = null;
    Node tail = null;


    public Node LastIndex(Node hade, int n){
        Node fast = head;
        Node slow = head;

        for (int i=1;i<=n;i++){
            fast = fast.next;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

public class que2 {
    public static void main(String[] args) {
        nNthNode nw = new nNthNode();
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        bb ll = new bb();
        //int k = nw.Size();
       // System.out.println(k);
        ll.display(a);
        nw.LastIndex(a,2);
        ll.display(a);


    }
}
