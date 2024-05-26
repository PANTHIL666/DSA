//Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
// Delete all nodes which have values greater than 25.
import java.util.Scanner;

class linkedList2Practice {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node to the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to delete nodes with values greater than 25
    public void deleteGreaterThan25() {
        while (head != null && head.data > 25) {
            head = head.next;
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data > 25) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // Method to display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        linkedList2Practice list = new linkedList2Practice();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers between 1 and 50 (type 'done' to finish):");

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value >= 1 && value <= 50) {
                list.add(value);
            } else {
                System.out.println("Please enter a number between 1 and 50.");
            }
        }

        // Removing nodes with values greater than 25
        list.deleteGreaterThan25();

        // Display the updated list
        System.out.println("Updated Linked List:");
        list.display();

        scanner.close();
    }
}

