package arvore;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Tree() {
        this.root = null;
    }

    public Node insert(Node root, Node newNode) {
        if (root == null) return newNode;

        if (newNode.getKey() < root.getKey()) {
            root.setEsq(
                    insert(root.getEsq(), newNode));
        } else {
            root.setDir(
                    insert(root.getDir(), newNode)
            );
        }
        return root;
    }

    public void print() {
        System.out.println(this.root);
    }
}

