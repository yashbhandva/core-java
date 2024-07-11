package binaryTrees;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }

}
class print{
    public void display(Node temp){

        if (temp!=null){
            System.out.println(temp.data);
            display(temp.left);
            display(temp.right);
        }
    }
}

public class basics{
    public static void main(String []args){

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = e;
        c.left = f;
        c.right = d;

        print p = new print();
        p.display(a);

    }
}