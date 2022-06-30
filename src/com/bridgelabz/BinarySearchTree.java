package com.bridgelabz;

public class BinarySearchTree {

    //create a function
    public static Node insert(Node root, int value) {
        //comparison
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            // left-subtree
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    //Inorder(left,root,right):-
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Preorder(root,left,right):-
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    //Postorder(left,right,root):-
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }


    //Search in BST
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {

            return search(root.right, key);
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to binary search tree !");

        int values[] = {56, 30, 70, 22, 40, 11, 3, 16, 60, 95, 65, 63, 67};

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder : ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder : ");
        postorder(root);
        System.out.println();

        if (search(root, 63)) {
            System.out.println("Key is found");
        } else {
            System.out.println("key is not found");
        }

    }
}
