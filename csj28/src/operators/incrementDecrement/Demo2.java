package operators.incrementDecrement;

public class Demo2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int p = ++a;
        int q = --b;
        int r = c++;
        int t = d--;

        System.out.println(p);//2
        System.out.println(q);//1
        System.out.println(r);//3
        System.out.println(t);//4

        System.out.println(a);//2
        System.out.println(b);//1
        System.out.println(c);//4
        System.out.println(d);//3
    }
}
