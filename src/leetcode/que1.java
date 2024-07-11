//can we delete a node given the node itself as parameter
package leetcode;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
class bb{
    Node head = null;
    Node tail = null;
    public void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void delete(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
    }

}

public class que1 {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
         a.next = b;
         b.next = c;

        bb ll = new bb();
        ll.display(a);
        System.out.println();
        ll.delete(b);
        System.out.println();
        ll.display(a);
    }
}
