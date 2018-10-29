package Assignment4;

import java.sql.*;

public class ConnectionPool {
    private DBConfiguration dbConfiguration;

    public ConnectionPool(DBConfiguration dbConfiguration) {
        this.dbConfiguration = dbConfiguration;
    }

    public static void main(String[] args) {
        DBConfiguration dbConfiguration = new DBConfiguration("jdbc:postgresql://localhost:5432/", "postgres", "postgres");
        ConnectionPool connectionPool = new ConnectionPool(dbConfiguration);
        Connection connection = connectionPool.getConnection();
        if(connection != null){
            System.out.println("connection created");
        }
    }

    private Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbConfiguration.getUrl(), dbConfiguration.getUser(), dbConfiguration.getPassword());
            Statement statement = connection.createStatement();
            String query = ("SELECT * FROM information");
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                int age = result.getInt("age");
                String place = result.getString("place");
                System.out.println(id);
                System.out.println(name);
                System.out.println(age);
                System.out.println(place);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
