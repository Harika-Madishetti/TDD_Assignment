package Assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

    public static Connection getConnection() throws SQLException {
        DBConfigurationManager dbConfigurationManager = new DBConfigurationManager("jdbc:postgresql://localhost:5432/", "postgres", "postgres");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(dbConfigurationManager.getUrl(), dbConfigurationManager.getUser(), dbConfigurationManager.getPassword());
        return connection;
    }
}
