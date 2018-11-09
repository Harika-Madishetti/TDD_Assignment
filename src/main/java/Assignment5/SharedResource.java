package Assignment5;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class SharedResource {
    private List<Connection> connections = new ArrayList<Connection>();
    private int MAX_SIZE = 25;
    private ConsumerThread consumerThread = new ConsumerThread();

    public synchronized void produce(Connection connection) {
        while (connections.size() < MAX_SIZE) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": producing connection");
            connections.add(connection);
            notifyAll();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized Connection consume() throws InterruptedException {
        while (connections.isEmpty()) {
            wait();
        }
        Connection producedConnection;
        if (consumerThread.isSelfish(Thread.currentThread().getId())) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": consuming connection ");
            producedConnection = connections.remove(0);
            System.out.println("Thread" + Thread.currentThread().getId() + "  is sleeping");
            Thread.sleep(2000);
        } else {
            System.out.println("Thread " + Thread.currentThread().getId() + ": consuming connection ");
            producedConnection = connections.remove(0);
        }
        notifyAll();
        return producedConnection;
    }
}
