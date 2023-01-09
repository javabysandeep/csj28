package controlStatements.transferControl;

public class ReturnDemo5 {
    public static void main(String[] args) {

        if(true){
            return;
//            System.out.println("below return");
        }

        System.out.println("outside of loop and rest of main");
        for (int i = 0; i <10 ; i++) {
            if(i==5){
                return;
            }
            System.out.println(i);
        }
    }
}
