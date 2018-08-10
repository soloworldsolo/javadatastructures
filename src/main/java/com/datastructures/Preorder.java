package com.datastructures;

public class Preorder {

    public void traverse(Node node) {
        if(node==null) return;

        System.out.println(node.getValue());
        traverse(node.getLeft());
        traverse(node.getRight());
    }
    }


