package classComponents.methods;

public class Product {
    // with no input no output
    // with input no output
    // with no input  but with output
    // with input  and output
    // instance methods
    // static methods

    void addProduct(){
        System.out.println("product added ");
    }
    static void productCompanyDetails(){
        System.out.println("Product company is Dell");
    }
    public static void main(String[] args) {
        Product product = new Product();

        //instance method we access with reference variable
        product.addProduct();

        //static method we access with class name
        Product.productCompanyDetails();

    }

}
