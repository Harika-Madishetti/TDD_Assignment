import PrimeNumber.Primenumber;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {
    private Primenumber primenumber = new Primenumber();
    @Test
    public void checkWeatherThreeIsPrime(){
        assertTrue(primenumber.check(3));
    }
    @Test
    public void checkWeatherFourIsPrime(){
        assertFalse(primenumber.check(4));
    }
    @Test
    public void checkWeatherGivenNumberIsPrime(){
        assertTrue(primenumber.check(5));
    }
    @Test
    public void checkWeatherTwoIsPrime(){
        assertTrue(primenumber.check(2));
    }
}
