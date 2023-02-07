package oops.anonymous;

public class Demo2 {
    public static void main(String[] args) {
        MusicService musicService = new MusicService(){

            @Override
            void bookTickets() {
                System.out.println("booking tickets");
            }
        };
        musicService.bookTickets();
    }
}
