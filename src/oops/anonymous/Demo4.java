package oops.anonymous;

import java.util.function.Consumer;

public class Demo4 {
    public static void main(String[] args) {
        Consumer consumer = new ConsumerImpl();
        Consumer consumer1 = new Consumer() {
            @Override
            public void accept(Object o) {

            }
        };
        Consumer consumer2 = (obj)->{};
    }
}
class ConsumerImpl implements  Consumer{

    @Override
    public void accept(Object o) {

    }
}
