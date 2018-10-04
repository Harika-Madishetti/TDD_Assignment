import FibonacciSeries.FibonacciSeries;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FibonacciSeriesTest {
    @Test
    public void number_in_index_0(){
        FibonacciSeries fibonacci = new FibonacciSeries();
        assertEquals(1,fibonacci.get(0));
    }
    @Test
    public void number_in_index_2(){
        FibonacciSeries fibonacci = new FibonacciSeries();
        assertEquals(2,fibonacci.get(2));
    }
    @Test
    public void number_in_index_3(){
        FibonacciSeries fibonacci = new FibonacciSeries();
        assertEquals(3,fibonacci.get(3));
    }
    @Test
    public void number_in_index_4(){
        FibonacciSeries fibonacci = new FibonacciSeries();
        assertEquals(5,fibonacci.get(4));
    }
    @Test
    public void number_in_index_5(){
        FibonacciSeries fibonacci = new FibonacciSeries();
        assertEquals(8,fibonacci.get(5));
    }
}
