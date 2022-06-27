package demogradle;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class RectangleTest {
    @Test
    public void testCalculateArea() {
        Rectangle r1 = new Rectangle(5, 10);
        double expectedResult = 5 * 10;
        double doneResult = r1.calculateArea();
        assertEquals(expectedResult, doneResult, 0);
    }

    @Test
    public void testCalculatePerimeter() {
        Rectangle r1 = new Rectangle(5, 10);
        double expectedResult = 2 * (5 + 10);
        double doneResult = r1.calculatePerimeter();
        assertEquals(expectedResult, doneResult, 0);
    }

    @Test
    public void testBaseGreaterThanZero() {
        Rectangle r1 = new Rectangle();
        r1.setBase(5);
        r1.setHeight(10);
        double expectedResult = 5;
        double doneResult = r1.getBase();
        assertEquals(expectedResult, doneResult, 0);
    }

    @Test
    public void testBaseEqualsZero() {
        Rectangle r1 = new Rectangle(5, 10);
        assertThrows(
                IllegalArgumentException.class,
                () -> { r1.setBase(0); },
                "IllegalArgumentException error was expected."
        );
    }

    @Test
    public void testBaseLessThanZero() {
        Rectangle r1 = new Rectangle(5, 10);
        assertThrows(
                IllegalArgumentException.class,
                () -> { r1.setBase(-5); },
                "IllegalArgumentException error was expected."
        );
    }

    @Test
    public void testHeightGreaterThanZero() {
        Rectangle r1 = new Rectangle(5);
        r1.setHeight(10);
        double expectedResult = 10;
        double doneResult = r1.getHeight();
        assertEquals(expectedResult, doneResult, 0);
    }

    @Test
    public void testHeightEqualsZero() {
        Rectangle r1 = new Rectangle(5);
        assertThrows(
                IllegalArgumentException.class,
                () -> { r1.setHeight(0); },
                "IllegalArgumentException error was expected."
        );
    }

    @Test
    public void testHeightLessThanZero() {
        Rectangle r1 = new Rectangle(5);
        assertThrows(
                IllegalArgumentException.class,
                () -> { r1.setHeight(-10); },
                "IllegalArgumentException error was expected."
        );
    }
}
