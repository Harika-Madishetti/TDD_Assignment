package Assignment2;

import Assignment3.RunLength;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CharTest {
    private Count count = new Count();
    @Test
    public void ShouldReturn_aFora1(){
        assertEquals("a1" , count.get("a"));
    }
    @Test
    public void ShouldReturn_abFora1b1(){
        assertEquals("a1b1c4d3a3q" , count.get("abccccdddEEEaaa"));
    }

}




//    @Test
//    public void encode_a(){
//        assertEquals("a1", new RunLength("a").encode());
//    }
