package com.datastructures;

public class Inorder {
  private   Node node;

    public void Traverse(Node node) {
        if(node==null) return;
        if(node.getLeft()!= null) {
            Traverse(node.getLeft());
            System.out.println(node.getValue());
            Traverse(node.getRight());
        }
        else {
            System.out.println(node.getValue());
            Traverse(node.getRight());
        }
    }

    public Inorder(Node node) {
        this.node = node;
    }
}
