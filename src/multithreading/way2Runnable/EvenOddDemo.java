package multithreading.way2Runnable;

public class EvenOddDemo {
    public static void main(String[] args) {
        Runnable evenWork = ()->{
            for (int i = 1; i <=100 ; i++) {
                if(i%2==0){
                    System.out.println(i+"\t"+Thread.currentThread().getName());
                }
            }
        };
        Thread even = new Thread(evenWork,"even");
        even.start();


        Runnable oddWork = ()->{
            for (int i = 1; i <=100 ; i++) {
                if(i%2==0){
                    System.out.println(i+"\t"+Thread.currentThread().getName());
                }
            }
        };
        Thread odd = new Thread(oddWork,"odd");
        odd.start();
    }
}
