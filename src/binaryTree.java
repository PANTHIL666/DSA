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

    static void inorderTraversal(Node root) {
        //follows LNR order
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    static void preorderTraversal(Node root) {
        //follows NLR order
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }


    static void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    static int height(Node root) {
        //maximum length in tree
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int size(Node root) {
        //number off node in tree
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    static int maximumValue(Node root) {
        if (root == null) {
              return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maximumValue(root.left), maximumValue(root.right)));
    }



    public static void main(String[] args) {
        Node root = createBinaryTree();
        inorderTraversal(root);
        System.out.println("        ");
        preorderTraversal(root);
        System.out.println("        ");
        postorderTraversal(root);
        int height = height(root);
        System.out.println("height of tree is /n:"+height);
        int size = size(root);
        System.out.println("size of tree is /n:"+size);
        System.out.println("maximum value is /n:"+maximumValue(root));

        // Optionally, close the scanner if you want
        // sc.close();
    }
}
