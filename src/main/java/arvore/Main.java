package arvore;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        Node node1 = new Node(15);

        tree.setRoot(
                tree.insert(tree.getRoot(), node1));

        Node node2 = new Node(8);

        tree.setRoot(
                tree.insert(tree.getRoot(), node2));

        Node node3 = new Node(23);

        tree.setRoot(
                tree.insert(tree.getRoot(), node3));

        Node node4 = new Node(2);

        tree.setRoot(
                tree.insert(tree.getRoot(), node4));

        Node node5 = new Node(12);

        tree.setRoot(
                tree.insert(tree.getRoot(), node5));

        Node node6 = new Node(20);

        tree.setRoot(
                tree.insert(tree.getRoot(), node6));

        Node node7 = new Node(30);

        tree.setRoot(
                tree.insert(tree.getRoot(), node7));

        tree.print(tree.getRoot());

        System.out.println();
        System.out.println(tree.contains(20, tree.getRoot()));
        System.out.println(tree.elementCount(tree.getRoot()));

    }

}
