package Assignment3;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class RunLengthDataTest {
    @Test
    public void encode_b(){
        assertEquals("b1", new RunLengthData("b").encode());
    }
    @Test
    public void encode_aaa(){
        assertEquals("a3", new RunLengthData("aaa").encode());
    }
    @Test
    public void encode_empty(){
        assertEquals("", new RunLengthData("").encode());
    }
    @Test
    public void encode_givendata(){
        assertEquals("a3s3e3d3", new RunLengthData("aaasssEEEddd").encode());
    }
    @Test
    public void decode_a1(){
        assertEquals("a", new RunLengthData("a1").decode());
    }
    @Test
    public void decode_a3b4(){
        assertEquals("aaabbbb", new RunLengthData("a3b4").decode());
    }
}
