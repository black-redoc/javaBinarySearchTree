package bst;

public class Node {
    private final int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public void addNode(Node node) {
        if (this.value < node.value) {
            if (this.right == null)
                this.right = node;
            else this.right.addNode(node);
        } else {
            if (this.left == null)
                this.left = node;
            else this.left.addNode(node);
        }
    }

    public int find(int value) {
        if (this.value > value) {
            if (this.left != null) {
                if (this.left.value == value) return this.left.value;
                else return this.left.find(value);
            }
        } else {
            if (this.right != null) {
                if (this.right.value == value) return this.right.value;
                else return this.right.find(value);
            }
        }
        return -1;
    }
}

