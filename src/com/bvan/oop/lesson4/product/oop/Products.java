package com.bvan.oop.lesson4.product.oop;

import com.bvan.oop.lesson4.product.Product;

import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Products {

    private final List<Product> products = new LinkedList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(ProductFormatter formatter) {
        for (Product product : products) {
            String s = formatter.format(product);
            System.out.println(s);
        }
    }
}
