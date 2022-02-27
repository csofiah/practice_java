package labs.pm.app;

import labs.pm.data.Product;

import java.math.BigDecimal;

public class Shop {

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(101);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));
    }


}
