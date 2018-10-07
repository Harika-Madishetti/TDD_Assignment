package Assignment2;

import org.junit.Test;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {

    @Test
    public void shouldReturnFalseForOne(){
        assertFalse(Number.isprime(1));
    }
    @Test
    public void shouldReturnTrueForTwo(){
        assertTrue(Number.isprime(2));
    }
    @Test
    public void shouldReturnFalseForFour(){
        assertFalse(Number.isprime(4));
    }
    @Test
    public void shouldReturnTrueForFive(){
        assertTrue(Number.isprime(5));
    }
    @Test
    public void shouldReturnFalseForInput(){
        assertFalse(Number.isprime(9));
    }
    @Test
    public void shouldReturnTrueForInput(){
        assertTrue(Number.isprime(11));
    }
    @Test
    public void shouldReturnFalseForNegativeInput(){
        assertFalse(Number.isprime(-12));
    }

}
