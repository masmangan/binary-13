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

    @Override
    public String toString() {
        return toString0(this.root);
    }

    private String toString0(Node node) {
        if (node == null)
            return "";

        return toString0(node.left)
                + node.value
                + toString0(node.right);
    }


}
public class Main {
    public static void main(String[] args) {
        System.out.println(" Binary Tree!");

        BinaryTree tree = new BinaryTree();

        Node plus = new Node("+");
        Node two = new Node("2");
        Node three = new Node("3");

        plus.left = two;
        plus.right = three;

        tree.root = plus;

        System.out.println(tree.isEmpty());
        System.out.println(tree.toString());
    }
}