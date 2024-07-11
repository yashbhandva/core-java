package leetcode;
//find middle element of link list


class MiddleElement{
    Node head = null;
    public void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public Node DME(){  //display middle element
        Node fast = head;
        Node slow = head;

        while (fast!=null && fast.next.next!=null){//right middle
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class que3 {
    public static void main(String[] args) {
        MiddleElement mm = new MiddleElement();
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

        mm.head = a;
        System.out.println("the middle element of linkdList is : "+mm.DME());
        mm.display(a);

    }
}
