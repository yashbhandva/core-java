package Collection;
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
class insertAtEnd{
    Node head = null;
    Node tail = null;
    public void fun(int data){
        //Node head = null;
       // Node tail = null;
        Node temp = new Node(data);
        if (head == null){
            temp = head;
        }
        else {
            temp.next=  tail;
        }
        temp = tail;
    }
    public void print(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
public class implementation {
    public static void main(String[] args) {
        insertAtEnd ll = new insertAtEnd();
        ll.fun(4);
        ll.fun(5);
        ll.print();
    }
}
