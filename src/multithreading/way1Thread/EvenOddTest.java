package multithreading.way1Thread;

public class EvenOddTest {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        even.setName("even");
        even.start();

        OddThread odd = new OddThread();
        odd.setName("odd");
        odd.start();
    }
}
