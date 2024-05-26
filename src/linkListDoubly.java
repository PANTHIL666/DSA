public class linkListDoubly {
    Node head;
    public class Node {
        int data;
        Node prev;
        Node next;
        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
            return;
        }
    }
    //Add new node at first position in link list
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        newNode.next = head;
        head.prev = newNode.next;
    }

    //Add new node at last position
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }
    //Add new node at particular position
   /* public void insertAtPosition(int index, int data) {
        if (index == 0) {
            insertAtFirst(data);
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {

        }

    }*/

    //printing link list
    public void print(){
        if (head == null) {
            System.out.println("List is empty");
        }
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " ");
        }
    }

    public static void main(String[] args) {
        linkListDoubly dbl = new linkListDoubly();
        dbl.insertAtFirst(1);
        dbl.insertAtLast(2);
        dbl.insertAtLast(3);
        dbl.insertAtLast(4);
        dbl.print();
    }
}
