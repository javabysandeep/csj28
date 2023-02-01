package oops.polymorphism.methodOverrding;

public class MessageServiceImpl extends MessageService{
    public void sendMessage(String message) {
        System.out.println("sending message using WhatsApp "+message);
    }

    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("");
    }
}
