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
        if (this.root == null)
            return "";
        return toString0(this.root.left)
                + this.root.value
                + toString0(this.root.right);
    }

    private String toString0(Node node) {
        if (node == null)
            return "";

        if (node.left == null && node.right == null)
            return node.value;

        return "(" + toString0(node.left)
                + node.value
                + toString0(node.right)
                + ")";
    }

    public int eval() {
        return eval0(this.root);
    }

    private int eval0(Node node) {
        if (node == null)
            return 0;

        if (node.left == null && node.right == null)
            return Integer.parseInt(node.value);

        if ("+".equals(node.value))
            return eval0(node.left)
                    + eval0(node.right);

        //if ("*".equals(node.value))
        return eval0(node.left)
                * eval0(node.right);

    }


}

public class Main {
    public static void main(String[] args) {
        System.out.println(" Binary Tree!");

        BinaryTree tree = new BinaryTree();

        Node plus = new Node("+");
        Node two = new Node("2");
        Node three = new Node("3");
        Node times = new Node("*");
        Node five = new Node("5");
        plus.left = two;
        plus.right = three;

        times.left = plus;
        times.right = five;

        tree.root = times;

        System.out.println(tree.isEmpty());
        System.out.println(tree);
        System.out.println(tree.eval());
    }
}