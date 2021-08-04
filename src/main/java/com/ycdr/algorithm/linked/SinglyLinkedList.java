package com.ycdr.algorithm.linked;

/**
 * 单向链表
 */
public class SinglyLinkedList<T> {

    private Node<T> head;

    public SinglyLinkedList() {

    }

    /**
     * 头插法,每个数据插入链表头部
     * @param t
     */
    public void insertToHead(T t) {
       Node<T> node= new Node<>(t);
    }

    private void insertToHead(Node<T> node) {
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    /**
     * 尾插法. 每个数据插入链表头部
     * @param t
     */
    public void insertTail(T t) {
        Node<T> newNode = new Node<>(t);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> tmp=head;
        while (tmp.next!=null){
             tmp=tmp.next;
        }
        tmp.next=newNode;
    }

    /**
     * 插入指定节点,后面数据
     * @param p
     * @param value
     */
    public void insertAfter(Node<T> p, T value){
        if (p==null) {
            return;
        }
        p.next = new Node<>(value);
    }

    /**
     * 插入指定节点前面
     * @param node
     * @param value
     */
    public void insertBefore(Node<T> node, T value) {
        if (node == null) {
            return;
        }
        Node<T> newNode = new Node<>(value);
        if (head == node) {
            insertToHead(newNode);
            return;
        }

        Node<T> q= head;
        while (q!=null && q.next!=node) {
            q = q.next;
        }

        if (q==null) {
            return;
        }
        q.next = newNode;
        newNode.next = node;
    }

    /**
     * 删除指定节点
     * @param node
     */
    public void deleteByNode(Node<T> node) {
        if (head == null) {
            return;
        }
        if (node == head) {
            head = node.next;
            return;
        }
        Node<T> tmp= head;
        while (tmp!=null&&tmp.next!=node) {
                tmp = tmp.next;
        }
        tmp.next=node.next;
    }

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                '}';
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> linked=new SinglyLinkedList<>();
        linked.insertTail(2);
        linked.insertTail(3);
        linked.insertTail(4);
        linked.insertTail(5);
        linked.insertTail(6);
        System.out.println(linked);

        int a =5;
        a=8;
        int b=a+1;
        //针对这行代码有可能优化为

    }
}
