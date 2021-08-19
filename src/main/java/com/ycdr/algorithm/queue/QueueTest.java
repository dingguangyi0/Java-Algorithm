package com.ycdr.algorithm.queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayCircularQueue<>(5);
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.traversal();

        Queue<String> fixedQueue = new ArrayFixedQueue<>(5);
        fixedQueue.enqueue("1");
        fixedQueue.enqueue("2");
        fixedQueue.enqueue("3");
        fixedQueue.enqueue("4");
        fixedQueue.enqueue("5");
        fixedQueue.traversal();
        System.out.println(fixedQueue.dequeue());
        System.out.println(fixedQueue.dequeue());
        System.out.println(fixedQueue.dequeue());
        System.out.println(fixedQueue.dequeue());
        System.out.println(fixedQueue.dequeue());
        fixedQueue.traversal();

        Queue<String> dynamicQueue = new ArrayDynamicQueue<>(5);
        dynamicQueue.enqueue("1");
        dynamicQueue.enqueue("2");
        dynamicQueue.enqueue("3");
        dynamicQueue.enqueue("4");
        dynamicQueue.enqueue("5");
        dynamicQueue.traversal();
        System.out.println(dynamicQueue.dequeue());
        System.out.println(dynamicQueue.dequeue());
        System.out.println(dynamicQueue.dequeue());
        dynamicQueue.enqueue("6");
        dynamicQueue.enqueue("7");
        dynamicQueue.enqueue("8");
        dynamicQueue.traversal();
    }
}
