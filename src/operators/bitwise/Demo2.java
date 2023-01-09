package operators.bitwise;

public class Demo2 {
    public static void main(String[] args) {
        // &, |, ^, ~, <<, >> ,>>>
        System.out.println(4 & 7);//4
        System.out.println(4 | 7);//7
        System.out.println(4 ^ 7);//3
        System.out.println(~4);//-5
        System.out.println(~-44);//43
        System.out.println(8 << 2);//32
        System.out.println(8 >> 2);//2
        System.out.println(8 << 4);// 8 * 2 ^4= 128
        System.out.println(8 << 5);// 8 * 2 ^5= 256
        System.out.println(8 >> 5);// 8 / 2 ^5= 0
        System.out.println(64 >> 5);// 64 / 2 ^5= 2
        //for left shift = num * 2 ^ no.of bits
        //for right shift = num / 2 ^ no.of bits
    }
}
