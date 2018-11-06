package Assignment5;

import java.sql.Connection;
import java.sql.SQLException;

public class Producer implements Runnable {

    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            Connection connection = DBConnectionManager.getConnection();
            sharedResource.produce(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
