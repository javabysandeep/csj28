package classComponents.blocks;

public class Product {
    int productId;
    int productPrice;
    String productName;

    static  int noOfObjectsCreated;

    public Product() {
        System.out.println("Zero param constructor");
    }

    {
        noOfObjectsCreated++;
        System.out.println("instance block");
    }
    static  {
        System.out.println("static block");
    }

    public Product(int productId, int productPrice, String productName) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productName = productName;
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        System.out.println("No. of objects created for Product class "+ noOfObjectsCreated);
    }
}
