package multithreading.way1Thread;

public class Task extends Thread{
    @Override
    public void run() {
        //run method is the job of thread. task or/ work to be completed
        for (int index = 1; index <1000 ; index++) {
            System.out.println(index+"\t"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Task task = new Task();
        task.setName("print1to1000");
        task.start();
        //task.run();


    }
}
