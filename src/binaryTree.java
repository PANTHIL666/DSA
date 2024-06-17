import java.util.Queue;
import java.util.LinkedList;
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

    //if i want to print element of level 3 then i pass level=3 in argument
    //This code take time to print node which we want is bigoof(n^2)
    //if we want to print all node than we have to wright only one simple for loop
    /*for(i in height of tree){
        levelorderRecursive(root,level)}*/
    static int levelOrderRecursive(Node root, int level) {
        if (root == null) {
            return 0;
        }
        if(level == 1) {
            System.out.print(root.data + " ");
        }
        levelOrderRecursive(root.left, level - 1);
        levelOrderRecursive(root.right, level - 1);
        return root.data;
    }

    //level order traversal using queue
    //time complexity is bigoof(n)
    //here we add null because when we complete one level then we want print new level at new line ..

    static void levelorderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if(current != null) {
                if(!queue.isEmpty()){
                    return;
                }
                queue.add(null);
                System.out.println("  ");
            }
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
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
        System.out.println("level order traversal is /n:"+ levelOrderRecursive(root, 3));
        System.out.println("Level order traversal is:");
        levelorderTraversal(root);
        // Optionally, close the scanner if you want
        // sc.close();
    }
}
