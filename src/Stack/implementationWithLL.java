package Stack;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}
class StackLL{
    Node head = null;
    int size = 0;

    public void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        size++;
    }
    public int pop(){
        if (head==null){
            System.out.println("Stack is empty!");
            return -1;
        }
        int top = head.data;
        head = head.next;
        size--;
        return top;
    }
    public int peek(){
        if (head==null){
            System.out.println("Stack is empty!");
        }
        return head.data;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int size(){
        return size;
    }
}
public class implementationWithLL {
    public static void main(String[] args) {
        StackLL list = new StackLL();
        list.push(13);
        list.push(18);
        list.push(22);
        list.push(10);
        list.push(75);
        list.push(43);

        System.out.println(list.size);
        list.display();
        list.pop();
        System.out.println(list.size);
        list.display();
        list.peek();
        System.out.println(list.peek());
        list.display();
        System.out.println(list.size);
    }
}
