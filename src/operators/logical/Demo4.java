package operators.logical;

public class Demo4 {
    public static void main(String[] args) {
//        System.out.println((3 > 4) && (5 > 4) && (5 > (10 / 0)));
        System.out.println((3 > 4) & (5 > 4) & (5 > (10 / 3)));
    }
}
