package demogradle;

import static org.junit.Assert.*;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testCalculateArea() {
        Rectangle r1 = new Rectangle(5, 10);
        double expectedResult = 5 * 10;
        double doneResult = r1.calculateArea();
        assertEquals(expectedResult, doneResult, 0);
    }
}
