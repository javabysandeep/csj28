package multithreading.way2Runnable;

public class Worker implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //Runnable work = new Worker();

        /*Runnable work = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=10 ; i++) {
                    System.out.println(i);
                }
            }
        };*/
        Runnable work = ()->{
            for (int i = 1; i <=10 ; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(work,"worker");
        thread.start();

        //this will not have task and name will be Thread-0
        //Thread thread = new Thread();
    }
}
