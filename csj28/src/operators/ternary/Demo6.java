package operators.ternary;

public class Demo6 {
    public static void main(String[] args) {
        int min = (4 < 5) ? 4 : 5;

        System.out.println(min);
        System.out.println((5 > 3) ? 'A' : "A");
        System.out.println((5 > 3) ? 'A' : 65);
        char ch6 = (5 > 3) ? 'A' : 65;
        System.out.println((5 > 3) ? 'A' : 69.0f);//65.0
        float v = (5 > 3) ? 'A' : 69.0f;
        char ch = 'A';
        float fl = ch;
//        char ch1 = fl;
    }
}
