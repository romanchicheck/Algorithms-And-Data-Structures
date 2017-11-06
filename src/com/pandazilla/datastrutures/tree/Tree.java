package com.pandazilla.datastrutures.tree;

public class Tree {

    private Node root;

    public Tree() {
    }

    public void insert(int id, double data) {
        Node node = new Node();
        node.setKey(id);
        node.setData(data);
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.getKey()) { //move on left?
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(node);
                        return;
                    }
                } else { //move on right?
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(node);
                        return;
                    }
                }
            }
        }
    }

    public Node find(int key) {
        Node current = root;
        while (current.getData() != key) {
            if (key < current.getData()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.getKey() != key) {
            parent = current;
            if (key < current.getKey()) {
                isLeftChild = true;
                current = current.getLeftChild();
            } else {
                isLeftChild = false;
                current = current.getRightChild();
            }
            if (current == null) {
                return false;
            }
        }

        if (current.getLeftChild() == null && current.getRightChild() == null) {
            deleteNodeWithoutChildren(current, parent, isLeftChild);
        } else if (current.getRightChild() == null) {
            deleteNodeWithOneChild(current, current.getLeftChild(), parent, isLeftChild);
        } else if (current.getLeftChild() == null) {
            deleteNodeWithOneChild(current, current.getRightChild(), parent, isLeftChild);
        } else {
            deleteNodeWithBothChildren(current, parent, isLeftChild);
        }
        return true;
    }

    private void deleteNodeWithoutChildren(Node current, Node parent, boolean isLeftChild) {
        if (current == root) {
            root = null;
        } else if (isLeftChild) {
            parent.setLeftChild(null);
        } else {
            parent.setRightChild(null);
        }
    }

    private void deleteNodeWithOneChild(Node current, Node child, Node parent, boolean isLeftChild) {
        if (current == root) {
            root = child;
        } else if (isLeftChild) {
            parent.setLeftChild(child);
        } else {
            parent.setRightChild(child);
        }
    }

    private void deleteNodeWithBothChildren(Node current, Node parent, boolean isLeftChild) {
        Node successor = getSuccessor(current);
        if (current == root) {
            root = successor;
        } else if (isLeftChild) {
            parent.setLeftChild(successor);
        } else {
            parent.setRightChild(successor);
        }
    }

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.getRightChild();
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }
        if (successor != delNode.getRightChild()) {
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(delNode.getRightChild());
        }
        return successor;
    }

    public Node maximum() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.getRightChild();
        }
        return last;
    }

    public Node minimum() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.getLeftChild();
        }
        return last;
    }

    /**
     * Algorithm Preorder(tree)
     * 1. Visit the root.
     * 2. Traverse the left subtree, i.e., call Preorder(left-subtree)
     * 3. Traverse the right subtree, i.e., call Preorder(right-subtree)
     * Preorder traversal is used to create a copy of the tree.
     * Preorder traversal is also used to get prefix expression on of an expression tree.
     * Please see http://en.wikipedia.org/wiki/Polish_notation to know why prefix expressions are useful.
     * Example: Preorder traversal for the above given figure is 1 2 4 5 3.
     *
     * @param localRoot
     */
    private void preOrder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        System.out.println(localRoot.getData());
        preOrder(localRoot.getLeftChild());
        preOrder(localRoot.getRightChild());
    }

    /**
     * Algorithm Inorder(tree)
     * 1. Traverse the left subtree, i.e., call Inorder(left-subtree)
     * 2. Visit the root.
     * 3. Traverse the right subtree, i.e., call Inorder(right-subtree)
     * In case of binary search trees (BST),
     * Inorder traversal gives nodes in non-decreasing order.
     * To get nodes of BST in non-increasing order,
     * a variation of Inorder traversal
     * where Inorder itraversal s reversed, can be used.
     * Example: Inorder traversal for the above given figure is 4 2 5 1 3.
     *
     * @param localRoot
     */
    private void inOrder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        inOrder(localRoot.getLeftChild());
        System.out.println(localRoot.getData());
        inOrder(localRoot.getRightChild());
    }

    /**
     * Algorithm Postorder(tree)
     * 1. Traverse the left subtree, i.e., call Postorder(left-subtree)
     * 2. Traverse the right subtree, i.e., call Postorder(right-subtree)
     * 3. Visit the root.
     * Postorder traversal is used to delete the tree.
     * Please see the question for deletion of tree for details.
     * Postorder traversal is also useful to get the postfix expression of an expression tree.
     * Please see http://en.wikipedia.org/wiki/Reverse_Polish_notation to for the usage of postfix expression.
     *
     * @param localRoot
     */
    private void postOrder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        postOrder(localRoot.getLeftChild());
        postOrder(localRoot.getRightChild());
        System.out.println(localRoot.getData());
    }

}
