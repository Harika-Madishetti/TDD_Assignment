package Assignment2;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
     private FizzBuzz fizzbuzz = new FizzBuzz();
    @Test
    public void shouldReturn1For1(){
        assertEquals("1",fizzbuzz.print(1));
    }
    @Test
    public void shouldReturnSameNumberAsGiven(){
        assertEquals("2",fizzbuzz.print(2));
    }
    @Test
    public void shouldReturnFizzFor3(){
        assertEquals("FIZZ",fizzbuzz.print(3));
    }
    @Test
    public void shouldReturnFizzIfNumberIsDivisibleBy3(){
        assertEquals("FIZZ",fizzbuzz.print(6));
    }
    @Test
    public void shouldReturnBuzzFor5(){
        assertEquals("BUZZ",fizzbuzz.print(5));
    }
    @Test
    public void shouldReturnBuzzIfNumberIsDivisibleBy5(){
        assertEquals("BUZZ",fizzbuzz.print(20));
    }
    @Test
    public void shouldReturnFizzBuzzIfNumberIsDivisibleBy5and3(){
        assertEquals("FIZZBUZZ",fizzbuzz.print(45));
    }
}
