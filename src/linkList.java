public class linkList {
    Node head;
    private int size;
    public linkList() {
        size = 0;
    }

    //creating a new node....
    public class Node {
        String data;
        Node next;
        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    //Adding new node at starting position
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Adding node at last position
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;

        }
        current.next = newNode;
    }
    //Printing a linklist
    public void print(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data+"\n|");
            current = current.next;

        }
        System.out.println("NULL");
}
    //delete firstNode
    public void deleteFirst(){
        if (head == null) {
            System.out.println("Lisk list is empty");
        }
        size--;
        head = head.next;
        }

    //delete LastNode
     public void deleteLast(){

        if (head == null) {
            System.out.println("Lisk list is empty");
        }
        size--;
        if (head.next == null) {
            head = null;
        }

        Node secondLast = head;
        Node Last = head.next;
        while (Last.next != null) {
            secondLast = secondLast.next;
            Last = Last.next;

        }
        secondLast.next = null;


    }

    //Get size Of LinkList
    public int getSize(){
        return size;


     }



    public static void main(String[] args) {
        linkList list = new linkList();

        list.addFirst("a");
        list.addFirst("is");
        list.print();

        list.addLast("list");
        list.print();

        list.addFirst("This");
        list.print();

        list.deleteFirst();
        list.print();

        list.deleteLast();
        list.print();

        System.out.println("size of link list is a "+list.getSize());

        list.addFirst("This");
        list.print();
        System.out.println("size of link list is a "+list.getSize());


    }
}
