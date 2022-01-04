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

    public Node contains(int key, Node root) {
        if (root == null) return null;
        if (root.getKey() == key) return root;
        if (root.getKey() > key) return contains(key, root.getEsq());
        return contains(key, root.getDir());
    }

    public int elementCount(Node root) {
        if (root == null) return 0;
        return elementCount(root.getEsq())
                + 1 + elementCount(root.getDir());
    }

    public void print(Node root) {
        if (root != null) {
            System.out.print(root.getKey());
            System.out.print("(");
            print(root.getEsq());
            print(root.getDir());
            System.out.print(")");
        }
    }
}

