import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import java.util.List;


public class CircularQueueTest {

CircularQueue<Integer> integerCircularQueue =new CircularQueue<> ();
@Test
public void pollFromEmptyQueue() {
    integerCircularQueue = new CircularQueue<> ();
    Assertions.assertThrows (EmptyStackException.class,() -> getPoll ( ))
;
}

@Test
public void sampleTest() {
    CircularQueue queue = new  CircularQueue();


}

}
