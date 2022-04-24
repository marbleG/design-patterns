package com.mabrle.designpatterns.factory;

import sun.plugin2.applet.Applet2IllegalArgumentException;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ProductFactory {
    final static Map<String, Supplier<Product>> map = new HashMap<>();

    static {
        map.put("loan", Loan::new);
        map.put("stock", Stock::new);
        map.put("bond", Bond::new);
    }

    public static Product createProduct(String name) {
        Supplier<Product> productSupplier = map.get(name);
        if (productSupplier != null) {

            return productSupplier.get();
        }
        throw new IllegalArgumentException("无效类");

    }

    public static void main(String[] args) {
        System.out.println(ProductFactory.createProduct("stock"));
    }
}
