package Assignment3_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SingletonTest {
    @Test
    public void shouldReturnSingleton(){
        Singleton object = Singleton.INSTANCE;
        object.setInput("Sigleton");
        assertEquals("Sigleton" , object.getInput());
    }
    @Test
    public void shouldReturnImplement(){
        Singleton object = Singleton.INSTANCE;
        Singleton object2 = Singleton.INSTANCE;
        object2.setInput("Implement");
        assertEquals("Implement", object.getInput());
    }
}
