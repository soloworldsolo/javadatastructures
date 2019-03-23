public class CircularQueue<E> {
    private int head = -1;
    private int tail = -1;
    private Object[] queue ;
    private static final int CAPACITY = 6;

    public  CircularQueue() {
        queue = (E[])new Object[CAPACITY];
    }

    public void  add(E element) {
         if(isFull ()) throw new ArrayStoreException("queue is full");
         if(isEmpty ()) head++;
         tail = nextPointInHeader ();
         queue[tail] = element;
    }

    public E poll() {
         if(isEmpty ()) throw new ArrayIndexOutOfBoundsException("no elelments found");
         return (E) queue[head++];
    }

    public boolean isEmpty() {
     return (head ==-1 && tail==-1);
    }

    public boolean isFull() {
             return (!isEmpty () &&head  == nextPointInHeader ());
    }

    public int nextPointInHeader() {
        if(tail+1 == CAPACITY) return  0;
         return  tail+1;
    }
}
