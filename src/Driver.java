public class Driver {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("Queue:");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        BST mytree = new BST();

        System.out.println("BST: ");
        mytree.insert(10);
        mytree.insert(2);
        mytree.insert(12);
        mytree.insert(1);
        mytree.insert(13);
        mytree.insert(20);

        mytree.InOrderTraversal();

    }
}
