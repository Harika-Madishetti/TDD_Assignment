package Assignment3_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnection implements ConnectionPool {

    private static int POOL_SIZE = 5;
    private String url;
    private String user;
    private String password;
    List<Connection> pool;
    List<Connection> usedConnections = new ArrayList<Connection>();

    public DBConnection(String url, String user, String password, List<Connection> pool){
        this.url = url;
        this.user = user;
        this.password = password;
        this.pool = pool;
    }

    public static DBConnection create(String url, String user, String password) throws SQLException {
          List<Connection> pool = new ArrayList<Connection>(POOL_SIZE);
          for(int iterator = 0; iterator < POOL_SIZE; iterator++){
              pool.add(createConnection(url,user,password));
          }
          return new DBConnection(url,user,password,pool);
    }

    public static Connection createConnection(String url, String user, String password) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","postgres");
    }

    @Override
    public Connection getConnection() throws SQLException {
        if(pool.isEmpty()){
                if (usedConnections.size() < POOL_SIZE) {
                    pool.add(createConnection(url, user, password));
                }else {
                    try {
                        throw new RuntimeException();
                    }catch (RuntimeException e){
                        System.out.println("Pool Size Reached");
                    }
            }
        }

       Connection connection = pool.remove(pool.size() - 1);
        usedConnections.add(connection);
            return connection;
    }
}
