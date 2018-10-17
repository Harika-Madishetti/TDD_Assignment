package Assignment3;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class RunLengthEncodingTest {
    @Test
    public void encode_a(){
        assertEquals("a1", new RunLength("a").encode());
    }
}
