package com.ycdr.algorithm.linked;

import com.ycdr.algorithm.linked.algo.ListNode;

import java.util.Objects;

/**
 * 单向链表
 * @author ycdr
 */
public class SinglyLinkedList<T> {

    private Node<T> head;

    /**
     * 插头法
     * 每个新的值 都在链表的头部
     * @param value
     */
    public void insertHead(T value) {
        if (Objects.isNull(value)) {
            throw new NullPointerException();
        }
        Node<T> newNode=new Node<>(value);
        if (Objects.isNull(head)) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * 插尾法
     * 每个新的值 都在链表的尾部
     * @param value
     */
    public void insertTail(T value) {
        if (Objects.isNull(value)) {
            throw new NullPointerException();
        }
        Node<T> newNode=new Node<>(value);
        if (Objects.isNull(head)) {
            head = newNode;
            return;
        }
        Node<T> tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    /**
     * 插入指定节点后面
     * @param node
     * @param value
     */
    public void insertAfter(Node<T> node,T value) {
        if (Objects.isNull(node)) {
            throw new NullPointerException();
        }
        if (Objects.isNull(value)) {
            throw new NullPointerException();
        }
        if (Objects.isNull(head)) {
            throw new NullPointerException();
        }
        Node<T> newNode=new Node<>(value);
        newNode.next = node.next;
        node.next = newNode;
    }

    /**
     * 插入指定节点前面
     * @param node
     * @param value
     */
    public void insertBefore(Node<T> node, T value) {
        if (Objects.isNull(node)) {
            throw new NullPointerException();
        }
        if (Objects.isNull(value)) {
            throw new NullPointerException();
        }
        if (Objects.isNull(head)) {
            throw new NullPointerException();
        }

        if (head == node) {
            insertHead(value);
            return;
        }

        Node<T> newNode=new Node<>(value);
        Node<T> tmp = head;
        while (Objects.nonNull(tmp)&&tmp.next!=node) {
            tmp = tmp.next;
        }

        if (Objects.isNull(tmp)) {
            return;
        }

        newNode.next = node;
        tmp.next = newNode;
    }

    /**
     * 根据值删除节点
     * @param value
     */
    public void deleteValue(T value) {
        if (Objects.isNull(value)) {
            throw new NullPointerException();
        }
        if (Objects.isNull(head)) {
            return;
        }
        Node<T> tmp = head;
        Node<T> h = null;
        while (Objects.nonNull(tmp)&&!Objects.equals(tmp.data,value)) {
            h=tmp;
            tmp = tmp.next;
        }
        if (Objects.isNull(tmp)) {
            return;
        }
        if (Objects.isNull(h)) {
            head = head.next;
            return;
        }
        h.next=h.next.next;
    }

    /**
     * 根据值查询节点
     * @param value
     * @return
     */
    public Node<T> findByValue(T value) {
        if (Objects.isNull(head)) {
            return null;
        }
        Node<T> tmp = head;
        while (Objects.nonNull(tmp)&&!Objects.equals(tmp.data,value)) {
            tmp = tmp.next;
        }
        return tmp;
    }

    /**
     * 根据下标查询节点
     * @param index
     * @return
     */
    public Node<T> findByIndex(int index) {
        if (Objects.isNull(head)) {
            return null;
        }
        Node<T> tmp = head;
        int pos = 0;
        while (Objects.nonNull(tmp)&&pos!=index) {
            tmp = tmp.next;
            pos++;
        }
        return tmp;
    }
    public Node<Integer> mergeTwoLists(Node<Integer> l1, Node<Integer> l2) {
        Node<Integer> newNode = null;
        while (l1!=null||l2!=null){
            merge(l1,l2,newNode);
        }
        return newNode;
    }

    private void merge(Node<Integer> l1, Node<Integer> l2, Node<Integer> newNode) {
        if (l1==null&&l2==null) {
            return;
        }
        if (l2==null||(l1!=null&&l1.data<= l2.data)) {
            Node<Integer> tmp = l1.next;
            l1.next= null;
            if (newNode ==null) {
                newNode = new Node<>(l1.data);
            } else {
                newNode.next = new Node<>(l1.data);
            }
            l1 =tmp;
        }else {
            Node<Integer> tmp = l2.next;
            l2.next=null;
            if (newNode ==null) {
                newNode = new Node<>(l1.data);
            } else {
                newNode.next = new Node<>(l1.data);
            }
            l2 =tmp;
        }
    }
    /**
     * 反转链表
     */
    public void reverseList() {
        if (Objects.isNull(head)) {
            return;
        }

        Node<T> pre = null;
        Node<T> curr= head;
        while (curr!=null) {
            Node<T> tmp = curr.next;
            curr.next = pre;
            pre=curr;
            curr=tmp;
        }
        head=pre;
    }

    class Node<T> {
        T data;
        Node<T> next;

        public Node() {}

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
        SinglyLinkedList<Integer> linkedList=new SinglyLinkedList<>();
        //insert
        linkedList.insertHead(3);
        linkedList.insertHead(2);
        linkedList.insertHead(1);
        System.out.println(linkedList);
        linkedList.insertTail(4);
        System.out.println(linkedList);
//        System.out.println(linkedList.findByIndex(3));
//        System.out.println(linkedList.findByValue(2));
//        linkedList.deleteValue(2);
//        System.out.println(linkedList);
        SinglyLinkedList<Integer> linkedList2=new SinglyLinkedList<>();
        linkedList2.insertTail(1);
        linkedList2.insertTail(3);
        linkedList2.insertTail(4);
        //linkedList.reverseList();
        System.out.println(linkedList);

        SinglyLinkedList.Node node = linkedList.mergeTwoLists(linkedList.findByIndex(0), linkedList2.findByIndex(0));
        System.out.println(node);
    }
}
