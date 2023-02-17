package exceptionHandling;

public class Demo24ClassCastException {
    public static void main(String[] args) {
        Product product = new Product();
        Student student = new Student();
        display(product);
    }
    public static void display(Object object){
        //type-casting
        Student student = (Student) object;
        System.out.println(student);
    }
}
