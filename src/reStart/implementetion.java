package reStart;

public class implementetion {
    public static void main(String[] args) {
        display ll = new display();
        deleteNthNodeFromLast df = new deleteNthNodeFromLast();
        displaySecondLastNode aa = new displaySecondLastNode();

        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ll.displayFunction(a);
        a = df.delete(a,5);
        ll.displayFunction(a);
        

    }
}
