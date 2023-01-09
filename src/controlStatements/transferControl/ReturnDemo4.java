package controlStatements.transferControl;

public class ReturnDemo4 {
    public static void main(String[] args) {
        //return statement must be at the end of method
//        return;
        for (int i = 1; i <=100 ; i++) {
            if(i==10){
                //it transfers the control from one method to another method
                // whenever it occures in the method that will be the last statement in the method
                return;//this will be end of method
            }
            System.out.println(i);
        }
        System.out.println("outside of loop and rest of main");
    }
}
