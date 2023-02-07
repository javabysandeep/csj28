package oops.anonymous;

public class Demo3 {
    public static void main(String[] args) {
        MovieService movieService = new MovieService() {
            @Override
            public void bookTickets() {
                System.out.println("book tickets");
            }
        };
        movieService.bookTickets();
    }
}
