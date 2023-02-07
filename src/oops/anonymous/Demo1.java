package oops.anonymous;

public class Demo1 {
    public static void main(String[] args) {
        // for interface
        MovieService movieService = new MovieServiceImpl();
        movieService.bookTickets();


        MovieService movieServiceAnon = new MovieService() {
            @Override
            public void bookTickets() {
                System.out.println("anonymous book tickets");
            }
        };
        movieServiceAnon.bookTickets();

        //for abstract
        MusicService musicService = new MusicServiceImpl();
        musicService.bookTickets();

        MusicService musicService1 = new MusicService() {
            @Override
            void bookTickets() {
                System.out.println("movie tickerts with anonymous class");
            }
        };
        musicService1.bookTickets();



    }
}
