package multithreading.way2Runnable;

public class GreetingDemo {
    public static void main(String[] args) {
        Runnable morningGreeting = ()-> System.out.println("Good morning");
        Thread task1 = new Thread(morningGreeting,"morning");

        Runnable afternoonGreeting = ()-> System.out.println("Good Afternoon");
        Thread task2 = new Thread(afternoonGreeting,"afternoon");

        Runnable eveningGreeting = ()-> System.out.println("Good Evening");
        Thread task3 = new Thread(eveningGreeting,"evening");

        task1.start();
        task2.start();
        task3.start();
    }
}
