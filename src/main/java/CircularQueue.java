import java.util.EmptyStackException;

public class CircularQueue<E> {
    private int head = 0;
    private int tail = 0;
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
    }

    public E poll() {
         if(isEmpty ()) throw new EmptyStackException ();
         E element=(E) queue[head++ % CAPACITY];
         -- tail;
         return element;
    }

    public boolean isEmpty() {
     return (head ==0 && tail==0);
    }

    public boolean isFull() {
             return (!isEmpty () && ((tail -head) == queue.length));
    }

    public int nextPointInHeader() {
        return (tail+head) % CAPACITY;
    }
}
