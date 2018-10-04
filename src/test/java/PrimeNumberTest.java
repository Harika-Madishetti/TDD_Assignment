import PrimeNumber.Primenumber;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {
    @Test
    public void checkWeatherTwoIsPrime(){
        Primenumber primenumber = new Primenumber();
        assertTrue(primenumber.check(11));
    }
    @Test
    public void checkWeatherFourIsPrime(){
        Primenumber primenumber = new Primenumber();
        assertFalse(primenumber.check(4));
    }
    @Test
    public void checkWeatherFiveIsPrime(){
        Primenumber primenumber = new Primenumber();
        assertFalse(primenumber.check(8));
    }
}
