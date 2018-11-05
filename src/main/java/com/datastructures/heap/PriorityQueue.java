package com.datastructures.heap;

public class PriorityQueue extends Heaps{


    public PriorityQueue(int[] heap) {
        super(heap);
        buildHeap();
    }

    public int Extarct_MAX() {
        int result = heap[0];
        swap(1,max_index--);
        heapify(1);
         return result;
    }

    /*
         no negative check only positive flow
     */
    public void insert_node(int value) {
        increaseCapacity();
        heap[max_index++] = value;
        int parentindex = max_index/2;
        heapify(parentindex);
    }

    public void deletemax(){

    }
}
