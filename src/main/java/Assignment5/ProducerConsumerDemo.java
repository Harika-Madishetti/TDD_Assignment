package Assignment5;

public class ProducerConsumerDemo {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        Thread producer = new Thread(new Producer(sharedResource));
        producer.start();
        for (int iterator = 0; iterator <= 5; iterator++) {
            Thread consumer = new Thread(new Consumer(sharedResource));
            consumer.start();
        }
    }
}
