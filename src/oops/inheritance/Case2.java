package oops.inheritance;

public class Case2 {
    public static void main(String[] args) {
        //Child class object and child class reference
        //with this we can access everything from child class and parent class[non-private,non-static, non-final]
        Child child = new Child();
        System.out.println(child.a);//100
        System.out.println(child.b);//200
        System.out.println(child.c);//300
        System.out.println(child.d);//400
    }
}
