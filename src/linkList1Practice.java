//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
// Search for the number 7 & display its index.
public class linkList1Practice {
    Node head;
    public class Node {

        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    //add element in linklist
    public void addElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head=newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    /* printing a link list*/
    public void printList() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    //Checking particular data in link list
    public void dataAvailable(int data) {
        Node current = head;
        while(current.data != data) {
            current = current.next;
        }
        System.out.println("\nyes this data is available "+current.data);
    }

    public static void main(String[] args) {
        linkList1Practice practiceLinkList = new linkList1Practice();
        practiceLinkList.addElement(1);
        practiceLinkList.addElement(5);
        practiceLinkList.addElement(7);
        practiceLinkList.addElement(3);
        practiceLinkList.addElement(8);
        practiceLinkList.addElement(2);
        practiceLinkList.addElement(3);
        practiceLinkList.printList();
        practiceLinkList.dataAvailable(7);
    }
}
