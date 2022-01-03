package arvore;

public class Node {
    private int key;
    private Node esq;
    private Node dir;

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getEsq() {
        return esq;
    }

    public void setEsq(Node esq) {
        this.esq = esq;
    }

    public Node getDir() {
        return dir;
    }

    public void setDir(Node dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", esq=" + esq +
                ", dir=" + dir +
                '}';
    }
}
