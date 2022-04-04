package com.gtxc.practice.fcc;

/*
    Created by gt at 10:15 AM on Monday, April 04, 2022.
    Project: practice, Package: com.gtxc.practice.fcc.
*/

public class SymmetricBinaryTree {

    static boolean isMirror(Node n1, Node n2) {
        if (n1 == null && n2 == null) return true;

        if (n1 != null && n2 != null && n1.key == n2.key) {
            return isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
        }
        return false;
    }

    static boolean isSymmetric(Node root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(5);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.right.right = new Node(2);
        root.left.right = new Node(8);
        root.right.left = new Node(8);
        root.left.right.left = new Node(1);
        root.right.left.right = new Node(1);
        root.left.left.left = new Node(9);
        root.right.right.right = new Node(9);
        root.left.left.right = new Node(7);
        root.right.right.left = new Node(7);
        root.left.left.right.right = new Node(6);
        root.right.right.left.left = new Node(6);

        System.out.println(isSymmetric(root));
    }

    static class Node {
        int key;
        Node left, right;

        Node(int item) {
            this.key = item;
            left = right = null;
        }
    }
}
