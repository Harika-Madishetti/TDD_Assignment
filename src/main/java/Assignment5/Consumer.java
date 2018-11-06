package Assignment5;

import java.sql.Connection;
import java.sql.SQLException;

public class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            Connection connection = sharedResource.consume();
            Thread.sleep(5000);
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
