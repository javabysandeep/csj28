package oops.polymorphism.methodOverrding;

public class MessageService {
     void sendMessage(String message){
        System.out.println("sending message using email "+message);
    }

    public static void main(String[] args) {
        System.out.println("this will be called by jvm");
        main();
    }

    public static void main() {
        System.out.println("overloaded");
    }
}
