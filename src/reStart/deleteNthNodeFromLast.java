package reStart;

public class deleteNthNodeFromLast {
    public Node delete(Node head,int n){
        Node fast = head;
        Node slow = head;
        for (int i=1;i<=n;i++){
            fast = fast.next;
        }
        if (fast==null){
            head = head.next;
            return head;
        }
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
