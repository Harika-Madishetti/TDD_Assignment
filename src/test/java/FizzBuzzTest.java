import FizzBuzz.FizzBuzz;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
    @Test
    public void print_the_number_1(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1",fizzbuzz.print(1));
    }
    @Test
    public void print_same_number_as_given(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("20",fizzbuzz.print(20));
    }
    @Test
    public void print_fizz_if_the_number_3(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("FIZZ",fizzbuzz.print(3));
    }
    @Test
    public void print_fizz_if_the_number_is_divisible_by_3(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("FIZZ",fizzbuzz.print(6));
    }
}
