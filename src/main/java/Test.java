import com.datastructures.heap.Heaps;
import com.datastructures.heap.PriorityQueue;

public class Test {
    public static void main(String[] aRG){

        int array[] = {5,13,2,25,7,17,20,8,4};
        PriorityQueue pr = new PriorityQueue(array);
         pr.insert_node(15);

         for (int a:pr.getHeap()) {
             System.out.println(a);
         }
    }
}