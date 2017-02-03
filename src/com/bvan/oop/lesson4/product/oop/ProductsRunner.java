package com.bvan.oop.lesson4.product.oop;

import com.bvan.oop.lesson4.product.Product;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("Lenovo", "notebook", 1000));
        products.add(new Product("iPhone", "smartphone", 800));

        products.print(new DSVProductFormatter("|"));
        System.out.println();

        products.print(new DSVProductFormatter("\t"));
        System.out.println();

        products.print(new ProductNameFormatter());
    }
}
