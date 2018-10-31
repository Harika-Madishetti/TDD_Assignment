package Assignment3_2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SingletonTest {
    @Test
    public void TestForCheckingSameReferenceForTwoObjects(){
        Singleton object1 = Singleton.INSTANCE;
        Singleton object2 = Singleton.INSTANCE;
        object1.hashCode();
        object2.hashCode();
        assertTrue(object2.equals(object1));
    }
}
