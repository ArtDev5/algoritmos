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

    public Node removeNode(Node root, int key) {
        Node[] nodes = findNodeToRemoveAndItsFather(root, key);
        assert nodes != null;
        Node father = (nodes[0] != null) ? nodes[0] : null;
        Node nodeToRemove = nodes[1];
        Node fatherFromWhomItWillBeAscended;
        Node nodeToAscend;

        if (nodeToRemove == null) return root;

        if (nodeToRemove.getEsq() == null || nodeToRemove.getDir() == null) {
            nodeToAscend = (nodeToRemove.getEsq() != null) ? nodeToRemove.getEsq() : nodeToRemove.getDir();
        } else {
            fatherFromWhomItWillBeAscended = nodeToRemove;
            nodeToAscend = nodeToRemove.getEsq();
            while(nodeToAscend.getDir() != null) {
                fatherFromWhomItWillBeAscended = nodeToAscend;
                nodeToAscend = nodeToAscend.getDir();
            }

            if (fatherFromWhomItWillBeAscended != nodeToRemove) {
                fatherFromWhomItWillBeAscended.setDir(nodeToAscend.getEsq());
                nodeToAscend.setEsq(nodeToRemove.getEsq());
            }
            nodeToAscend.setDir(nodeToRemove.getDir());
        }

        if(father == null) {
            cleanNode(nodeToRemove);
            return nodeToAscend;
        }
        if (key < father.getKey()) {
            father.setEsq(nodeToAscend);
        } else {
            father.setDir(nodeToAscend);
        }
        cleanNode(nodeToRemove);
        return root;
    }

    private Node[] findNodeToRemoveAndItsFather(Node root, int key) {
        Node current = root;
        Node father;
        Node[] nodes = new Node[2];
        while (current != null) {
            if (current.getKey() == key) return nodes;
            father = current;
            current = (key < current.getKey()) ? current.getEsq() : current.getDir();
            nodes[0] = father;
            nodes[1] = current;
        }
        return null;
    }

    private void cleanNode(Node node) {
        node.setKey(0);
        node.setEsq(null);
        node.setDir(null);
    }
}

