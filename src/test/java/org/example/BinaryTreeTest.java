package org.example;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

    public class BinaryTreeTest {
        @Test
        public void newTreeIsEmpty() {
            BinaryTree tree = new BinaryTree();

            boolean expected = true;
            boolean actual = tree.isEmpty();

            assertEquals(expected, actual);
            assertEquals(0, tree.eval());
        }

        @Test
        public void checkToString() {
            BinaryTree tree = new BinaryTree();

            /**   root  -+
             *           |
             *           v
             *           +
             *         /   \
             *        2     3
             *
             *        2+3
             */
            Node plus = new Node("+");
            Node two = new Node("2");
            Node three = new Node("3");
            plus.left = two;
            plus.right = three;
            tree.root = plus;

            String expected = "2+3";
            String actual = tree.toString();

            assertEquals(expected, actual);
            assertEquals(5, tree.eval());
        }


        @Test
        public void checkSingleNode() {
            BinaryTree tree = new BinaryTree();

            /**   root  -+
             *           |
             *           v
             *           8
             *
             *           "8"
             */
            tree.root = new Node("8");

            String expected = "8";
            String actual = tree.toString();

            assertEquals(expected, actual);
            assertEquals(8, tree.eval());
        }

        @Test
        public void checkTo() {
            BinaryTree tree = new BinaryTree();

            /**    root  ----+
             *               |
             *               v
             *               *
             *             /   \
             *           +      5
             *         /   \
             *        2     3
             *
             *        (2+3)*5
             */
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

            String expected = "(2+3)*5";
            String actual = tree.toString();

            assertEquals(expected, actual);
            assertEquals(25, tree.eval());
        }

        @Test
        public void checkToMirror() {
            BinaryTree tree = new BinaryTree();

            /**    root  ----+
             *               |
             *               v
             *               +
             *             /  \
             *           2     *
             *               /   \
             *              3     5
             *
             *        2+(3*5)
             */
            Node plus = new Node("+");
            Node two = new Node("2");
            Node three = new Node("3");
            Node times = new Node("*");
            Node five = new Node("5");

            plus.left = two;
            plus.right = times;

            times.left = three;
            times.right = five;

            tree.root = plus;

            String expected = "2+(3*5)";
            String actual = tree.toString();

            assertEquals(expected, actual);
            assertEquals(17, tree.eval());
        }


    }

