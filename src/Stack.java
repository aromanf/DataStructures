public class Stack {
    private static class Node {
        int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    // Methods Stack
    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;

    }

    public int pop() {
        int data;
        if(top != null) {
            data = top.data;
            top = top.next;
            return data;
        }

        else {
            throw new IllegalArgumentException("Top is null.");
        }

    }
}
