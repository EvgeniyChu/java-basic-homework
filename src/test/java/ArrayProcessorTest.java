import org.junit.jupiter.api.Test;
import ru.evgeniychurakov.java.basic.homeworks.ArrayProcessor;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ArrayProcessorTest {
    private ArrayProcessor ap;
    @Test
    public void testElementsAfterLastOne() {
        ap = new ArrayProcessor();
        assertArrayEquals(new int[]{2, 2}, ap.elementsAfterLastOne(new int[]{1, 2, 1, 2, 2}));
    }


    @Test
    public void testIsValidArray() {
        ap = new ArrayProcessor();
        assertTrue(ap.isValidArray(new int[]{1, 2}));
    }
}