package eStore;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private int productId;
    private String productName;
    private BigDecimal price;
    private String productDescription;
    List<ProductCategory> productCategory;
}
