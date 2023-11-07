package org.example;


class Node {
    String value;
    Node left;
    Node right;

    Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    boolean isEmpty() {
        return this.root == null;
    }

}
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        BinaryTree tree = new BinaryTree();
    }
}