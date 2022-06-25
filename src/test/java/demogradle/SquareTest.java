package demogradle;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquareTest {
    @Test
    public void testCalculateArea() {
        Square s1 = new Square(5);
        double expectedResult = 5 * 5;
        double doneResult = s1.calculateArea();
        assertEquals(expectedResult, doneResult, 0);
    }
}
