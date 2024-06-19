import java.util.ArrayList;

public class binarySearchTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        public static Node insert(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else if (data > root.data) {
                root.right = insert(root.right, data);
            }
            return root;
        }

        public static void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.println(root.data);
            inorderTraversal(root.right);

        }
        public static boolean search(Node root, int data) {
            if (root == null) {
                return false;
            }
            if (root.data == data) {
                return true;
            }
            if (data < root.data) {
                return search(root.left, data);
            }
            return search(root.right, data);
        }
        public static Node delete(Node root, int val) {
            if (root == null) {
                return null;
            }

            if (val < root.data) {
                root.left = delete(root.left, val);
            } else if (val > root.data) {
                root.right = delete(root.right, val);
            } else {
                // Case 1: Leaf node (no children)
                if (root.left == null && root.right == null) {
                    return null;
                }
                // Case 2: One child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                // Case 3: Two children
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
            return root;
        }

        public static Node findInorderSuccessor(Node root) {
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }
        public static void printInRange(Node root,int X,int Y){
            if(root==null){
                return;
            }
            if(root.data>=X && root.data<=Y){
                printInRange(root.left,X,Y);
                System.out.println(root.data);
                printInRange(root.right,X,Y);
            } else if (root.data>= Y) {
                printInRange(root.left,X,Y);
            }
            else {
                printInRange(root.right,X,Y);
            }
        }

        //print two the leaf node
        public static void printPath(ArrayList<Integer> list) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i < list.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }

        public static void printRootToLeaf(Node root, ArrayList<Integer> list) {
            if (root == null) {
                return;
            }
            list.add(root.data);
            if (root.left == null && root.right == null) {
                printPath(list);
            } else {
                printRootToLeaf(root.left, list);
                printRootToLeaf(root.right, list);
            }
            list.remove(list.size() - 1);
        }




        public static void main(String[] args) {
            int[] values = {1,4,3,5,8,6,10,11,14};
            Node root = null;
            for (int value : values) {
                root = insert(root, value);
            }
            inorderTraversal(root);
            boolean exist=search(root, 14);
            System.out.println(exist);
            delete(root, 10);
            System.out.println("after deleting a Node");
            inorderTraversal(root);
            System.out.println(" ");
            printInRange(root,6,11);
            printRootToLeaf(root,new ArrayList<>());
        }
    }
}
