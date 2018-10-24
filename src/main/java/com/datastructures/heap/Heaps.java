package com.datastructures.heap;

public class Heaps {


    private int[] heap;



    public Heaps(int[] heap) {
        if(heap==null || heap.length ==0) throw  new ArrayStoreException("Empty Array");
       this.heap =heap;

    }

    public  void heapify() {

    }
}
