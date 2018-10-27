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
}
