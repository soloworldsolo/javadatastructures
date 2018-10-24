package com.datastructures.heap;

public class Heaps {


    private int[] heap;



    public Heaps(int[] heap) {
        if(heap==null || heap.length ==0) throw  new ArrayStoreException("Empty Array");
       this.heap =heap;

    }

    private int getNodevalue(int index) {
        if(index> heap.length ) return  -1;
         return  heap[index-1];
    }

    private  void heapify(int index) {
      int leftchildindex = (2*index);
      int rightchild = (2*index)+1;
      int greatest  = -1;
      if(index < heap.length && index>0) {
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

    private void swap(int index, int greatest) {
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
        int i = (heap.length /2)+1;
        while(i>=0) {
           heapify(--i);

        }
    }

    public int[] getHeap() {
        return heap;
    }


}
