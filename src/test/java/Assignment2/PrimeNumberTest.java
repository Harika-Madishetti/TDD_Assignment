package Assignment2;

import org.junit.Test;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {
    private Number number = new Number();
    @Test
    public void shouldReturnFalseForOne(){
        assertFalse(number.isprime(1));
    }
    @Test
    public void shouldReturnTrueForTwo(){
        assertTrue(number.isprime(2));
    }
    @Test
    public void shouldReturnFalseForFour(){
        assertFalse(number.isprime(4));
    }
    @Test
    public void shouldReturnTrueForFive(){
        assertTrue(number.isprime(5));
    }
    @Test
    public void shouldReturnFalseForInput(){
        assertFalse(number.isprime(9));
    }
    @Test
    public void shouldReturnTrueForInput(){
        assertTrue(number.isprime(11));
    }
    @Test
    public void shouldReturnFalseForNegativeInput(){
        assertFalse(number.isprime(-12));
    }

}
