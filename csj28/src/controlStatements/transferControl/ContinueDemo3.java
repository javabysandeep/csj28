package controlStatements.transferControl;

public class ContinueDemo3 {
    public static void main(String[] args) {
        // continue must be used only inside the loops
//        break;//cte

        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                continue;
                //it skips the current iteration and continues from next iteration
            }
            System.out.println(i);
        }
        System.out.println("outside of loop and rest of main");
    }
}
