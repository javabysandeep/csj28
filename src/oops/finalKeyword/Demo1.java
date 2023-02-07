package oops.finalKeyword;

public class Demo1 {
    public static void main(String[] args) {
        final int abc = 20;
        // for final variable we cant reassign the value
        // abc= 30; //CTE as abc is final
        final Student student = new Student(1,"abc");
       // student = null;//CTE

        Student student2 = new Student(2,"xys");
       // student = student2;//CTE
    }
}
