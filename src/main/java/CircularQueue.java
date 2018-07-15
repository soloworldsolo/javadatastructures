public class CircularQueue {
    private int head = -1;
    private int tail = -1;
    private int[] queue ;
    private static final int CAPACITY = 6;

    public  CircularQueue() {
        queue = new int[CAPACITY];
    }

    public void  enqueue(int element) {
         if(isfull()) throw new ArrayStoreException("queue is full");
         if(isempty()) head++;
         tail = nextpointerisheade();
         queue[tail] = element;

    }

    public void dequeue() {
         if(isempty()) throw new ArrayIndexOutOfBoundsException("no elelments found");
         queue[head++] = -1;


    }

    public boolean isempty() {
     return (head ==-1 && tail==-1);
    }

    public boolean isfull() {
             return (!isempty() &&head  == nextpointerisheade());
    }

    public int nextpointerisheade() {
        if(tail+1 == CAPACITY) return  0;
         return  tail+1;
    }
}
