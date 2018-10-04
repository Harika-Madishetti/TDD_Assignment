import FizzBuzz.FizzBuzz;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
    @Test
    public void print_the_number_1(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(1,fizzbuzz.print(1));
    }
    @Test
    public void print_same_number_as_given(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(10,fizzbuzz.print(10));
    }
}
