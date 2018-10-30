package Assignment3_1;

import org.junit.Test;
import java.sql.SQLException;
import static org.junit.Assert.assertTrue;

public class BasicConnectionPoolTest {
    @Test
    public void TestToCreateConnection() throws SQLException {
        assertTrue(new DBConnection().createConnection("jdbc:postgresql://localhost:5432/","postgres","postgres").isValid(1));
    }
}
