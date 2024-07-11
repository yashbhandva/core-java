package reStart;

public class displaySecondLastNode {
    Node head = null;
    Node tail = null;

    public  Node nNthNode(Node head,int x){
        Node fast = head;
        Node slow = head;
        for (int i=1;i<=x;i++){
            fast = fast.next;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
