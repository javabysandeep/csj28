package oops.abstraction;

public class MessageServiceImpl extends MessageService {
    MessageServiceImpl(){
        super();
        System.out.println("child class con");
    }

    @Override
    void sendMessage() {
        System.out.printf("sending message");
    }

    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();
    }
}
