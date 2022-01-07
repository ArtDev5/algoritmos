package arvore;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        Node node1 = new Node(18);

        tree.setRoot(
                tree.insert(tree.getRoot(), node1));

        Node node2 = new Node(8);

        tree.setRoot(
                tree.insert(tree.getRoot(), node2));

        Node node3 = new Node(2);

        tree.setRoot(
                tree.insert(tree.getRoot(), node3));

        Node node4 = new Node(14);

        tree.setRoot(
                tree.insert(tree.getRoot(), node4));

        Node node5 = new Node(16);

        tree.setRoot(
                tree.insert(tree.getRoot(), node5));

        Node node6 = new Node(10);

        tree.setRoot(
                tree.insert(tree.getRoot(), node6));

        Node node7 = new Node(9);

        tree.setRoot(
                tree.insert(tree.getRoot(), node7));

        Node node8 = new Node(12);

        tree.setRoot(
                tree.insert(tree.getRoot(), node8));

        Node node9 = new Node(11);

        tree.setRoot(
                tree.insert(tree.getRoot(), node9));

        tree.print(tree.getRoot());
        System.out.println();
        System.out.println(tree.elementCount(tree.getRoot()));

        tree.setRoot(
                tree.removeNode(tree.getRoot(), 12));

        System.out.println(tree.contains(14, tree.getRoot()));

        tree.print(tree.getRoot());
        System.out.println();
        System.out.println(tree.elementCount(tree.getRoot()));

    }

}
