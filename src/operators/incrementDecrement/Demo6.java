package operators.incrementDecrement;

public class Demo6 {
    public static void main(String[] args) {
        int a =1;
        int b =2;
        int c =3;
        int d =4;

        int p = ++a;
        int q = --b;
        int r = c++;
        int s = d--;
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
        /*System.out.println(++a);//2
        System.out.println(--b);//1
        System.out.println(c++);//3
        System.out.println(d--);//4*/
        System.out.println(a);//2
        System.out.println(b);//1
        System.out.println(c);//4
        System.out.println(d);//3
    }
}
