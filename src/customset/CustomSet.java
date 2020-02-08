package customset;

public class CustomSet<T extends Comparable<T>> {
    private int size;
    Node<T> root;

    public CustomSet() {
        size = 0;
        root = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (root == null) {
            root = newNode;
            size++;
        }  else {
            addNode(root, newNode);
        }
    }

    private void addNode(Node<T> pointerNode, Node<T> newNode) {
        if (newNode.data.equals(pointerNode.data)) {
            return;
        } else {
            if (newNode.data.compareTo(pointerNode.data) < 0) {
                if (pointerNode.left == null) {
                    pointerNode.left = newNode;
                    size++;
                } else {
                    addNode(pointerNode.left, newNode);
                }
            } else if (newNode.data.compareTo(pointerNode.data) > 0) {
                if (pointerNode.right == null) {
                    pointerNode.right = newNode;
                    size++;
                } else {
                    addNode(pointerNode.right, newNode);
                }
            }
        }
    }


    public boolean contains(T data) {
        Node<T> nodeToFind = new Node<T>(data);
        if (containsNode(root, nodeToFind) != null) {
            return true;
        } else {
            return false;
        }
    }

    private Node<T> containsNode(Node<T> pointerNode, Node<T> nodeToFind) {
        if (pointerNode == null) {
            return null;
        }
        if (nodeToFind.data.equals(pointerNode.data)) {
            return pointerNode;
        } else {
            Node<T> foundNode = containsNode(pointerNode.left, nodeToFind);
            if (foundNode == null) {
                foundNode = containsNode(pointerNode.right, nodeToFind);
            } else {
                containsNode(pointerNode.left, nodeToFind);
            }
            return foundNode;
        }
    }

//    public boolean remove() {};

    public void printTree() {
        traverseToPrint(root);
    }

    private void traverseToPrint(Node<T> node) {
        if (node != null) {
            traverseToPrint(node.left);
            System.out.println(node.data);
            traverseToPrint(node.right);
        }
    }

    public int getSize() {
        return size;
    }
}
