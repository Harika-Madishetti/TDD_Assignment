package Assignment3_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection createConnection(String url, String user, String password) throws SQLException {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","postgres");
    }
}
