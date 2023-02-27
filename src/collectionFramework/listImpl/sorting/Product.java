package collectionFramework.listImpl.sorting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private int productPrice;

    @Override
    public int compareTo(Product product) {
      // return this.productId-product.productId;
        //return this.productPrice-product.productPrice;
        return this.productName.compareTo(product.productName);
    }
}
