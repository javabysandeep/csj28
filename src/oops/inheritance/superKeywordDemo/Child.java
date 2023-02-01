package oops.inheritance.superKeywordDemo;

public class Child extends Parent{
    Child(){
        //super();
        System.out.println("Child class con");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }

}
