package Queues;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}
class queueLL{
    Node head = null;
    Node tail = null;
    int size = 0;
    public void add(int data){
        Node temp = new Node(data);
        if (size==0){
            head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public int remove(){
        if (size==0){
            System.out.println("queue is empty!");
            return -1;
        }
        else {
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }
    }
    public int peek(){
        if (size==0){
            System.out.println("queue is empty!");
            return -1;
        }
        else {
            return head.data;
        }
    }
    public void display(){
        if (size==0){
            System.out.println("queue is empty!");
            return;
        }
        else {
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
}
public class implementationWithLinkList {
    public static void main(String[] args) {
        queueLL LL = new queueLL();
        LL.display();
        LL.add(4);
        LL.add(5);
        LL.add(6);
        LL.add(7);
        LL.add(8);
        LL.add(9);

        LL.display();
        LL.remove();
        LL.display();
        System.out.println("the size of queue is : "+LL.size);
        System.out.println("the top most element in queue is : "+LL.peek());
    }
}
