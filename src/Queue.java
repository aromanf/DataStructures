public class Queue {
    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void enqueue(int data) {
        Node node = new Node(data);

        if(tail != null) {

            tail.next = node;
        }
        tail = node;

        if(head == null) {
            head = node;
        }
    }

    public int dequeue() {
        int data = head.data;
        head = head.next;

        if(tail == null) {
            head = null;
        }
        return data;
    }
}
