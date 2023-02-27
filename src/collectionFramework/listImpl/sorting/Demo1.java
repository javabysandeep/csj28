package collectionFramework.listImpl.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product(11,"mobile",1000);
        Product product2 = new Product(3,"laptop",1000);
        Product product3 = new Product(2,"projector",200);
        Product product4 = new Product(41,"digital panel",300);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        Collections.sort(productList);
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
