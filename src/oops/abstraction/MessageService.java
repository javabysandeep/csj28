package oops.abstraction;

abstract public class MessageService {
    abstract void sendMessage();
    MessageService(){
        System.out.println("MessageService con : abstract class");
    }

    public static void main(String[] args) {
        //CTE
        // MessageService messageService = new MessageService();
    }
}
