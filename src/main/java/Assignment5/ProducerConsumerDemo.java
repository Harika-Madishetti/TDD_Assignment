package Assignment5;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producer = new Thread(new Producer(sharedResource));
        Thread consumer1 = new Thread(new Consumer(sharedResource));
        Thread consumer2 = new Thread(new Consumer(sharedResource));
        Thread consumer3 = new Thread(new Consumer(sharedResource));
        Thread consumer4 = new Thread(new Consumer(sharedResource));
        Thread consumer5 = new Thread(new Consumer(sharedResource));
        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
        consumer5.start();
    }
}
