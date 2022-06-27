package demogradle;

import static org.junit.Assert.*;
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
}
