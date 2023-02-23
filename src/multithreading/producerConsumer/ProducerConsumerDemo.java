package multithreading.producerConsumer;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Product product = new Product();
        Thread producer = new Thread(()-> product.produce(),"producer");
        Thread consumer = new Thread(()-> product.consume(),"consumer");

        producer.start();
        consumer.start();
    }
}
