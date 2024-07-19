/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trees;

/**
 *
 * @author fbarasa
 */
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Insert a new node with the given key
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // Inorder traversal
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Preorder traversal
    void preorder() {
        preorderRec(root);
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Postorder traversal
    void postorder() {
        postorderRec(root);
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    // Search for a key in the binary tree
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }
        return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(11);
        tree.insert(6);
        tree.insert(8);
        tree.insert(19);
        tree.insert(4);
        tree.insert(10);
        tree.insert(5);
        tree.insert(17);
        tree.insert(43);
        tree.insert(49);
        tree.insert(31);

        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("\n\nPreorder traversal:");
        tree.preorder();

        System.out.println("\n\nPostorder traversal:");
        tree.postorder();

        int key = 40;
        System.out.println("\n\nSearch for " + key + ":");
        System.out.println(tree.search(key) ? "Key found" : "Key not found");

        key = 90;
        System.out.println("\n\nSearch for " + key + ":");
        System.out.println(tree.search(key) ? "Key found" : "Key not found");
    }
}

