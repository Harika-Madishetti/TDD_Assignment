package Assignment2;

import org.junit.Test;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {
    @Test
    public void shouldReturnFalseForOne(){
        assertFalse(new Number(1).isprime());
    }
    @Test
    public void shouldReturnTrueForTwo(){
        assertTrue(new Number(2).isprime());
    }
    @Test
    public void shouldReturnFalseForFour(){
        assertFalse(new Number(4).isprime());
    }
    @Test
    public void shouldReturnTrueForFive(){
        assertTrue(new Number(5).isprime());
    }
    @Test
    public void shouldReturnFalseForInput(){
        assertFalse(new Number(9).isprime());
    }
    @Test
    public void shouldReturnTrueForInput(){
        assertTrue(new Number(11).isprime());
    }
    @Test
    public void shouldReturnFalseForNegativeInput(){
        assertFalse(new Number(-20).isprime());
    }

}
