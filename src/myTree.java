class BST {
    private class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    Node root;

    public void insert(int value) {
        root = insertNode(root, value);
    }

    private Node insertNode(Node currentNode, int value) {
        if(currentNode == null) {
            currentNode = new Node(value);
            return currentNode;
        }

        else {
            if(value < currentNode.value)
                currentNode.left = insertNode(currentNode.left, value);
            else if (value > currentNode.value)
                currentNode.right = insertNode(currentNode.right, value);
        }
        return currentNode;
    }

    public void InOrderTraversal() {
        InOrderTraverseNode(root);
    }

    public void InOrderTraverseNode(Node currentNode) {
        if(currentNode != null) {
            InOrderTraverseNode(currentNode.left);
            System.out.println(currentNode.value);
            InOrderTraverseNode(currentNode.right);
        }
    }
}