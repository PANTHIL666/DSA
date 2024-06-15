import java.util.Scanner;

public class binaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Node createBinaryTree() {
        Scanner sc = new Scanner(System.in); // Move Scanner initialization outside of recursive calls
        return createBinaryTreeHelper(sc); // Helper method to handle recursion
    }

    static Node createBinaryTreeHelper(Scanner sc) {
        System.out.println("Enter your data (enter -1 for no node):");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node root = new Node(data); // Initialize root node
        System.out.println("Enter left side of binary tree for node with data " + data);
        root.left = createBinaryTreeHelper(sc);
        System.out.println("Enter right side of binary tree for node with data " + data);
        root.right = createBinaryTreeHelper(sc);
        return root;
    }

    public static void main(String[] args) {
        Node root = createBinaryTree();
        // Optionally, close the scanner if you want
        // sc.close();
    }
}
