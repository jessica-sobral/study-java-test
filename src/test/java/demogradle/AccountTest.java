package demogradle;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Test;

public class AccountTest {
    @Test
    public void testIdGreaterThanZero() {
        Account a1 = new Account();
        a1.setId(1);
        a1.setLimit(150);
        double expectedResult = 1;
        double doneResult = a1.getId();
        assertEquals(expectedResult, doneResult, 0);
    }

    @Test
    public void testIdEqualsZero() {
        Account a1 = new Account(1, 150);
        assertThrows(
                IllegalArgumentException.class,
                () -> { a1.setId(0); },
                "IllegalArgumentException error was expected."
        );
    }

    @Test
    public void testIdLessThanZero() {
        Account a1 = new Account(1, 150);
        assertThrows(
                IllegalArgumentException.class,
                () -> { a1.setId(-1); },
                "IllegalArgumentException error was expected."
        );
    }

    @Test
    public void testLimitGreaterThanZero() {
        Account a1 = new Account(1, 100);
        a1.setLimit(150);
        double expectedResult = 150;
        double doneResult = a1.getLimit();
        assertEquals(expectedResult, doneResult, 0);
    }

    @Test
    public void testLimitEqualsZero() {
        Account a1 = new Account(1, 150);
        assertThrows(
                IllegalArgumentException.class,
                () -> { a1.setLimit(0); },
                "IllegalArgumentException error was expected."
        );
    }
}
