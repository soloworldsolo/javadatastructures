public class Test {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        for(int i=0;i<=5;i++) {
            queue.enqueue(i*i);
        }
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(25);
        System.out.println("checking");

    }
}
