package com.ycdr.algorithm.tree;

import java.util.Objects;

public class BinaryTree <T extends Comparable<T>> {

    private Node<T> tree;



    public void add(T t) {
        if (Objects.isNull(tree)) {
            tree = new Node<>(t);
            return;
        }
        Node<T> p = tree;
        while (Objects.nonNull(p)) {
            if (t.compareTo(p.t)>0) {
                if (Objects.isNull(p.right)) {
                    p.right = new Node<>(t);
                    return;
                }
                p = p.right;
            } else {
                if (Objects.isNull(p.left)) {
                    p.left = new Node<>(t);
                    return;
                }
                p = p.left;
            }
        }
    }

    class Node <T extends Comparable<T>> {
        private T t;
        private Node<T> left;
        private Node<T> right;

        public Node () {}

        public Node (T t) {
            this.t = t;
        }
    }
}
