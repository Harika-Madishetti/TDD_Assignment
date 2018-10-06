package Assignment2;

import org.junit.Test;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {
    private Number Number = new Number();
    @Test
    public void checkWeatherThreeIsPrime(){
        assertTrue(Number.check(3));
    }
    @Test
    public void checkWeatherFourIsPrime(){
        assertFalse(Number.check(4));
    }
    @Test
    public void checkWeatherGivenNumberIsPrime(){
        assertTrue(Number.check(5));
    }
    @Test
    public void checkWeatherTwoIsPrime(){
        assertTrue(Number.check(2));
    }
}
