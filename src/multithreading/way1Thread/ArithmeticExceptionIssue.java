package multithreading.way1Thread;

public class ArithmeticExceptionIssue extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ArithmeticExceptionIssue thread = new ArithmeticExceptionIssue();
        thread.setName("custom");
        thread.start();

        //main
        System.out.println(10/0);
    }
}
