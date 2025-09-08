package InterviewQuestions;

public class MyLinkedList <T>{
    public class Node{
        private T data;
        private Node next;
        private Node prev;

        Node(T data){
            this.data = data;
        }

        private Node head;
        private Node tail;
        private int size = 0;

        public void add(T data){
            Node node = new Node(data);
            if (head == null){
                head = tail = node;
            }
            else {

            }
        }
    }

}
