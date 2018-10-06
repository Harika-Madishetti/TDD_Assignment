package Assignment2;

import Assignment2.FibonacciSeries;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FibonacciSeriesTest {
    private FibonacciSeries fibonacci = new FibonacciSeries();
    @Test
    public void number_in_index_0(){
        assertEquals(1,fibonacci.get(0));
    }
    @Test
    public void number_in_index_2(){
        assertEquals(2,fibonacci.get(2));
    }
    @Test
    public void number_in_index_3(){
        assertEquals(3,fibonacci.get(3));
    }
    @Test
    public void number_in_index_4(){
        assertEquals(5,fibonacci.get(4));
    }
    @Test
    public void number_in_index_5(){
        assertEquals(8,fibonacci.get(5));
    }
}
