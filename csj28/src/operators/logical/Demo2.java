package operators.logical;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        int year = 2020;
        System.out.println(
                (year % 400 == 0)
                        ||
            (year % 100 != 0 && year % 4 == 0)

        );
        //false
    }
}
//git clone copied-link
//goto folder
//git pull