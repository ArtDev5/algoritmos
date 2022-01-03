package arvore;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        Node node1 = new Node(25);

        tree.setRoot(
                tree.insert(tree.getRoot(), node1));

        Node node2 = new Node(23);

        tree.setRoot(
                tree.insert(tree.getRoot(), node2));

        Node node3 = new Node(15);

        tree.setRoot(
                tree.insert(tree.getRoot(), node3));

        Node node4 = new Node(12);

        tree.setRoot(
                tree.insert(tree.getRoot(), node4));

        tree.print();

    }

}
