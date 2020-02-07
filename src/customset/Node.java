package customset;

class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public int compareTo(Node<T> newNode) {
        return this.data.compareTo(newNode.data);
    }
}
