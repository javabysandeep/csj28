package classComponents.variables;

public class Student {
   //instance variables : specific to object
   int rollNumber;
   String studentName;
   String batch;
   String studyingInYear;

   //static variable: common for all the objects
   static String collegeName;

    public static void main(String[] args) {
        //local variables
        int rollNumber;
        String studentName;
        String batch;
        String studyingInYear;
        String collegeName;
    }
    int add(int number1 , int number2){
        return number1 +number2;
    }
}
