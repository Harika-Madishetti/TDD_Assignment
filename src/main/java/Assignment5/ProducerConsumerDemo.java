package Assignment5;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producer = new Thread(new Producer(sharedResource));
        Thread consumer = new Thread(new Consumer(sharedResource));
        producer.start();
        consumer.start();
    }
}
