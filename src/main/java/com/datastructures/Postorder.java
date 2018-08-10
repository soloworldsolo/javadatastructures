package com.datastructures;

public class Postorder {

    public void traverse(Node node) {
        if(node== null) return;
        traverse(node.getLeft());
        traverse(node.getRight());
        System.out.println(node.getValue());
    }

}
