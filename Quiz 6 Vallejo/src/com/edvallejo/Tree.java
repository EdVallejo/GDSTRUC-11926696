package com.edvallejo;

public class Tree {
    private Node root;

    public void insert(int value)
    {
        if (root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    public Node getMin()
    {
        Node current = root;
        while (current.getLeftChild() != null)
        {
            current = current.getLeftChild();
        }
        System.out.println("Min value: " + current);
        return current;
    }

    public Node getMax()
    {
        Node current = root;
        while(current.getRightChild() != null)
        {
            current = current.getRightChild();
        }
        System.out.println("Max value: " + current);
        return current;
    }

    public void traverseInOrderDescending()
    {
        if(root != null)
        {
            root.traverseInOrderDescending();
        }
    }
}
