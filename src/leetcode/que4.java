package leetcode;
//deleting the middle element of linkedList

class deleteElement{
    Node head = null;
    public Node DME(){      //delete middle elements
        Node slow = head;
        Node fast = head;
        if (head.next==null){
            return null;
        }
        while (fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.data = slow.next.data;
        slow.next = slow.next.next;
        return null;
    }
}
public class que4 {
    public static void main(String[] args) {
        deleteElement de = new deleteElement();
        MiddleElement mm2 = new MiddleElement();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        de.head = a;
        mm2.display(a);
        de.DME();
        mm2.display(a);
    }
}
