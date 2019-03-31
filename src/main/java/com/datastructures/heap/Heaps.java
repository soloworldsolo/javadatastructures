package com.datastructures.heap;

import java.util.PriorityQueue;

public class Heaps {


    protected int[] heap;

    protected int max_index;



    public Heaps(int[] heap) {
        if(heap==null || heap.length ==0) throw  new ArrayStoreException("Empty Array");
       this.heap =heap;
       this.max_index = heap.length;

    }

    public Heaps(int[] heap,int maxindex) {
        if(heap==null || heap.length ==0) throw  new ArrayStoreException("Empty Array");
        this.heap = heap;
        this.max_index = maxindex;

    }

    private int getNodevalue(int index) {
        if(index> max_index ) return  -1;
         return  heap[index-1];
    }

    protected   void heapify(int index) {
      int leftchildindex = (2*index);
      int rightchild = leftchildindex+1;
      int greatest  = -1;
      if(index < max_index && index>0) {
          if (getNodevalue(leftchildindex) > heap[index-1])
              greatest = leftchildindex;
          if(getNodevalue(rightchild) > heap[index-1])  {
              if(greatest ==-1)
                  greatest = rightchild;
              else {
                greatest =  getGreatest(leftchildindex,rightchild);
              }
          }
      }
      if (greatest != -1) {
          swap(index,greatest);
          heapify(greatest);
      }
    }

    protected void swap(int index, int greatest) {
       int indexpos = index -1;
        int greatestpos = greatest -1;
        int temp = heap[indexpos];
        heap[indexpos] = heap[greatestpos];
        heap[greatestpos] = temp;


    }


    private int getGreatest(int leftchildindex, int rightchild) {
        if(heap[leftchildindex -1]> heap[rightchild- 1]) return  leftchildindex;
        return rightchild;
    }

    public void buildHeap() {
        int i = (heap.length>>>1)+1;
        while(i>=0) {
           heapify(--i);
            PriorityQueue<String> hello = new PriorityQueue<> ();

        }
    }


    public  void increaseCapacity() {
        if(max_index>= heap.length) {
            int[] newArray = new int[max_index*2];
            for(int i=0;i<max_index;i++) {
                newArray[i] = heap[i];
            }
            heap = newArray;
        }
    }

    public int[] getHeap() {
        return heap;
    }


}
