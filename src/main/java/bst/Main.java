package bst;

public class Main {
    public static void main(String[] args) {
        final var tree = new Tree();
        for (int i = 0 ; i <= 30; i ++) {
            tree.addValue((int)Math.floor(Math.random()*100+1));
        }
        final var list = tree.traverse();
        final var num = 20;
        final var found = tree.find(num);
        System.out.println(list);
        System.out.println("root => " + tree.getRoot());
        System.out.println(num + " founded => " + found);
    }
}
