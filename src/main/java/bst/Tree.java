package bst;
import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;
    private List<Integer> list;

    public int getRoot() {
        return this.root.getValue();
    }

    public int find(int value) {
        if (this.root.getValue() == value)
            return this.root.getValue();
        else
            return this.root.find(value);
    }

    public void addValue(int value) {
        final var n = new Node(value);
        if (this.root == null)
            this.root = n;
        else this.root.addNode(n);
    }

    public final List<Integer> traverse() {
        list = new ArrayList<>();
        if (this.root == null) return List.of();
        traverse(this.root.getLeft());
        list.add(this.root.getValue());
        traverse(this.root.getRight());
        return list;
    }

    private void traverse(Node n) {
        if (n != null) {
            traverse(n.getLeft());
            list.add(n.getValue());
            traverse(n.getRight());
        }
    }
}

