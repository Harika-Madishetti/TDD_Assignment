package Assignment3_1;

import java.sql.Connection;

public interface ConnectionPool {
    Connection getConnection();
}
