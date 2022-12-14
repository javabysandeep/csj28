package operators.bitwise;

public class Demo1 {
    public static void main(String[] args) {
        //bitwise operators : &, |, ^, ~, <<, >>, >>>
        System.out.println(4 & 5);//4
        System.out.println(4 | 5);//5
        System.out.println(4 ^ 5);//1
        System.out.println(4 << 1);//8 =
        System.out.println(4 >> 1);//2
        System.out.println(4 >>> 1);//2

        System.out.println(4 << 2);//16
        System.out.println(4 << 3);//32
        System.out.println(4 << 4);//64
        System.out.println(4 << 5);//128
        System.out.println(4 << 6);//256

        System.out.println(4 >> 1);//2
        System.out.println(4 >> 2);//1
        System.out.println(4 >> 3);//0
        System.out.println(4 >> 4);//0
        System.out.println(4 >> 5);//0
        System.out.println(4 >> 6);//0
        System.out.println(4 >> 7);//0
        System.out.println(4 >> 8);//0
        System.out.println(4 >> 9);//0
        System.out.println(4 >> 10);//0

        System.out.println(~4);//-5
        System.out.println(~5);//-6
        System.out.println(~51);//-52
        System.out.println(~-51);//50
        System.out.println(~-4);//3

    }
}
