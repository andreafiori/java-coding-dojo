package com.algorithms.arrays;

public class LinkedListHelper {
    private Node head;
    private Node tail;

    public LinkedListHelper() {
        this.head = new Node("head");
        tail = head;
    }

    /**
     * @return Node
     */
    public Node head() {
        return head;
    }

    /**
     * @param node
     */
    public void add(Node node) {
        tail.next = node;
        tail = node;
    }

    public static class Node {
        private Node next;
        private String data;

        /**
         * @param data
         */
        public Node(String data) {
            this.data = data;
        }

        /**
         * @return
         */
        public String data() {
            return data;
        }

        /**
         * @param data
         */
        public void setData(String data) {
            this.data = data;
        }

        /**
         * @return
         */
        public Node next() {
            return next;
        }

        /**
         * @param next
         */
        public void setNext(Node next) {
            this.next = next;
        }

        /**
         * {@inheritDoc}
         */
        public String toString() {
            return this.data;
        }
    }
}
