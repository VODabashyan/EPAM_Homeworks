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
        } else {
            addNode(root, newNode);
        }
    }

    private void addNode(Node<T> pointerNode, Node<T> newNode) {
        if (newNode.data.equals(pointerNode.data)) {
            return;
        } else {
            if (newNode.data.compareTo(pointerNode.data) < 0) {
                if (pointerNode.left == null) {
                    newNode.parent = pointerNode;
                    pointerNode.left = newNode;
                    size++;
                } else {
                    addNode(pointerNode.left, newNode);
                }
            } else if (newNode.data.compareTo(pointerNode.data) > 0) {
                if (pointerNode.right == null) {
                    newNode.parent = pointerNode;
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

    public Node<T> findNode(T data) {
        Node<T> nodeToFind = new Node<T>(data);
        if (root == null) {
            return null;
        } else {
            return containsNode(root, nodeToFind);
        }
    }

    private Node<T> containsNode(Node<T> pointerNode, Node<T> nodeToFind) {
        if (pointerNode == null) {
            return null;
        }
        if (nodeToFind.data.compareTo(pointerNode.data) == 0) {
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


    public boolean remove(T data) {
        Node<T> nodeToRemove = findNode(data);
        if (nodeToRemove == null) {
            return false;
        } else {
            if (nodeToRemove.left == null && nodeToRemove.right == null) {
                removeNodeWithNoChildren(nodeToRemove);
            } else if (nodeToRemove.left != null && nodeToRemove.right != null) {
                removeNodeWithTwoChildren(nodeToRemove);
            } else if (nodeToRemove.left != null) {
                removeNodeWithOneChild(nodeToRemove);
            } else if (nodeToRemove.right != null) {
                removeNodeWithOneChild(nodeToRemove);
            }
            size--;
            return true;
        }
    }

    private void removeNodeWithNoChildren(Node<T> nodeToRemove) {
        if (nodeToRemove.parent.left == nodeToRemove) {
            nodeToRemove.parent.left = null;
        } else if (nodeToRemove.parent.right == nodeToRemove) {
            nodeToRemove.parent.right = null;
        }
    }

    private void removeNodeWithOneChild(Node<T> nodeToRemove) {
        if (nodeToRemove.parent.left == nodeToRemove) {
            if (nodeToRemove.left != null) {
                nodeToRemove.parent.left = nodeToRemove.left;
            } else if (nodeToRemove.right != null) {
                nodeToRemove.parent.left = nodeToRemove.right;
            }
        } else if (nodeToRemove.parent.right == nodeToRemove) {
            if (nodeToRemove.left != null) {
                nodeToRemove.parent.right = nodeToRemove.left;
            } else if (nodeToRemove.right != null) {
                nodeToRemove.parent.right = nodeToRemove.right;
            }
        }
    }

    private void removeNodeWithTwoChildren(Node<T> nodeToRemove) {
        Node<T> smallestNode = getTheSmallestLeftChild(nodeToRemove.right);
        removeNodeWithOneChild(smallestNode);

        smallestNode.parent = nodeToRemove.parent;
        smallestNode.left = nodeToRemove.left;
        smallestNode.right = nodeToRemove.right;

        if (nodeToRemove.parent == null) {
            root = smallestNode;
        } else {
            if (nodeToRemove.parent.left == nodeToRemove) {
                nodeToRemove.parent.left = smallestNode;
            } else if (nodeToRemove.parent.right == nodeToRemove) {
                nodeToRemove.parent.right = smallestNode;
            }
        }
    }

    private Node<T> getTheSmallestLeftChild(Node<T> node) {
        if (node.left == null) {
            return node;
        } else {
            return getTheSmallestLeftChild(node.left);
        }
    }


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
