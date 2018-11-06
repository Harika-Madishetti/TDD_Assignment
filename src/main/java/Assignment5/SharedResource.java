package Assignment5;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class SharedResource {
    List<Connection> connections = new ArrayList<Connection>();
    private int MAX_SIZE = 25;

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
        System.out.println("Thread " + Thread.currentThread().getId() + ": consuming connection ");
        Connection producedConnection = connections.remove(0);
        notifyAll();
        return producedConnection;
    }

}
