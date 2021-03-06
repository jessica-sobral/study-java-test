package demogradle;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Test;

public class SquareTest {
    @Test
    public void testCalculateArea() {
        Square s1 = new Square(5);
        double expectedResult = 5 * 5;
        double doneResult = s1.calculateArea();
        assertEquals(expectedResult, doneResult, 0);
    }

    @Test
    public void testCalculatePerimeter() {
        Square s1 = new Square(5);
        double expectedResult = 4 * 5;
        double doneResult = s1.calculatePerimeter();
        assertEquals(expectedResult, doneResult, 0);
    }

    @Test
    public void testSideGreaterThanZero() {
        Square s1 = new Square();
        s1.setSide(5);
        double expectedResult = 5;
        double doneResult = s1.getSide();
        assertEquals(expectedResult, doneResult, 0);
    }

    @Test
    public void testSideEqualsZero() {
        Square s1 = new Square();
        assertThrows(
                IllegalArgumentException.class,
                () -> { s1.setSide(0); },
                "IllegalArgumentException error was expected."
        );
    }

    @Test
    public void testSideLessThanZero() {
        Square s1 = new Square();
        assertThrows(
                IllegalArgumentException.class,
                () -> { s1.setSide(-5); },
                "IllegalArgumentException error was expected."
        );
    }
}
