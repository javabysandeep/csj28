package classComponents.methods.assignments;

import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;

    void setDimension(int localLength, int localBreadth){
    // assign local variable values to instance variables
        length = localLength;
        breadth = localBreadth;
    }
    int getArea(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter the length and breadth");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        rectangle.setDimension(length,breadth);
        System.out.println("Area of rectangle is "+rectangle.getArea());
    }
}
