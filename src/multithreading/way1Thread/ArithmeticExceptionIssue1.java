package multithreading.way1Thread;

public class ArithmeticExceptionIssue1 extends Thread{
    @Override
    public void run() {
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        ArithmeticExceptionIssue1 thread = new ArithmeticExceptionIssue1();
        thread.setName("custom");
        thread.start();

        //main
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
    }
}
