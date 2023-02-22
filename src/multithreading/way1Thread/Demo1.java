package multithreading.way1Thread;

public class Demo1 {
    public static void main(String[] args) {

        // traditional way
        Runnable worker = new Worker();
        worker.run();

        //anonymous class
        Runnable ref = new Runnable(){
            @Override
            public void run() {
            System.out.println("anonymous run running");
        }
        };
        ref.run();

        // java 8 way using lambda expression
        Runnable runnable = ()-> System.out.println("lambda run method running");
        runnable.run();

    }
}
