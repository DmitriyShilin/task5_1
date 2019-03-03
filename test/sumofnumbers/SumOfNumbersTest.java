package sumofnumbers;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumOfNumbersTest {
    
    public SumOfNumbersTest() {
    }

    @Test
    public void testFirstMethod() {
        int n = 12;
        int expResult = 3;
        int result = SumOfNumbers.firstMethod(n);
        assertEquals(expResult, result);        
    }

    @Test
    public void testSecondMethod() {        
        int n = 12;
        int expResult = 3;
        int result = SumOfNumbers.secondMethod(n);
        assertEquals(expResult, result);
    }
}
