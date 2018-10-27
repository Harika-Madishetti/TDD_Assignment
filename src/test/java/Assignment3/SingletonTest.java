package Assignment3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SingletonTest {
    @Test
    public void simpleTest(){
        Singleton.INSTANCE.setStatement("Sigleton implementation by enum");
        assertEquals("Sigleton implementation by enum" , Singleton.INSTANCE.getStatement());
    }
}
