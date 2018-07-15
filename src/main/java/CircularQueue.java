public class CircularQueue {
    private int head = -1;
    private int tail = -1;
    private int[] queue ;
    private static final int CAPACITY = 16;

    public  CircularQueue() {
        queue = new int[CAPACITY];
    }

    public void  enqueue(int element) {
         if(isfull()) throw new ArrayStoreException("queue is full");
         if(isempty()) head++;
         queue[++tail] = element;

    }

    public void dequeue() {
         if(isempty()) throw new ArrayIndexOutOfBoundsException("no elelments found");
         queue[head++] = -1;


    }

    public boolean isempty() {
     return (head ==-1 && tail==-1);
    }

    public boolean isfull() {
             return (head+1  == nextpointerisheade());
    }

    public int nextpointerisheade() {
        if(++tail == CAPACITY) return  0;
         return  tail;
    }
}
