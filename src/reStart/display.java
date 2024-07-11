package reStart;

public class display {
    Node head = null;
    Node tail = null;

    public void displayFunction(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
