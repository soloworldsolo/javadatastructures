import java.util.EmptyStackException;

public class CircularQueue<E> {
    private int head = -1;
    private int tail = -1;
    private Object[] queue ;
    private  int CAPACITY;

    public  CircularQueue() {
       this(6);
    }

    public CircularQueue(int capacity) {
        this.CAPACITY = capacity;
        queue = (E[])new Object[CAPACITY];
    }

    public void  add(E element) {
         if(isFull ()) throw new ArrayStoreException("queue is full");
         queue[nextPointInHeader ()] = element;
         tail++;
         if(isEmpty ())
             head++;
    }

    public E poll() {
         if(isEmpty ()) throw new EmptyStackException ();
         int index = head++ % CAPACITY;
         E element=(E) queue[index];
         queue[index] = null;
         return element;
    }

    public boolean isEmpty() {
     return head ==-1;
    }

    public boolean isFull() {
             return  tail+1%CAPACITY == head;
    }

    public int nextPointInHeader() {
        return (tail+1) % CAPACITY;
    }
}
