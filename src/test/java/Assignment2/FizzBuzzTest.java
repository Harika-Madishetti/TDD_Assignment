package Assignment2;

import Assignment2.FizzBuzz;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
     private FizzBuzz fizzbuzz = new FizzBuzz();
    @Test
    public void print_the_number_1(){
        assertEquals("1",fizzbuzz.print(1));
    }
    @Test
    public void print_same_number_as_given(){
        assertEquals("2",fizzbuzz.print(2));
    }
    @Test
    public void print_fizz_if_the_number_is_3(){
        assertEquals("FIZZ",fizzbuzz.print(3));
    }
    @Test
    public void print_fizz_if_the_number_is_divisible_by_3(){
        assertEquals("FIZZ",fizzbuzz.print(6));
    }
    @Test
    public void print_buzz_if_the_number_is_5(){
        assertEquals("BUZZ",fizzbuzz.print(5));
    }
    @Test
    public void print_buzz_if_the_number_is_divisible_by_5(){
        assertEquals("BUZZ",fizzbuzz.print(20));
    }
    @Test
    public void print_fizzbuzz_if_the_number_is_divisible_by_3and5(){
        assertEquals("FIZZBUZZ",fizzbuzz.print(45));
    }
}
