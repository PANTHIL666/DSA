import org.w3c.dom.Node;

import java.util.Scanner;
public class Practice2LinkList {
    Node head;
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Add Element in linklist
    public void addElement(int data) {
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

    //printing a linklist
    public void printList() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " ");
        }
    }

    public static void main(String[] args) {
        Practice2LinkList p = new Practice2LinkList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element in the list");
        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            if (data >= 1 && data <= 10) {
                p.addElement(data);
            } else {
                System.out.println("Enter value between 1to 50");
            }


        }
        sc.close();
        p.printList();


    }
}
