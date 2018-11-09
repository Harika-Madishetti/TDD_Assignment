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
        while (true) {
            try {
                Connection connection = sharedResource.consume();
                connection.close();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
