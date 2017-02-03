package com.bvan.oop.lesson4.product.proc;

import com.bvan.oop.lesson4.product.Product;

/**
 * @author bvanchuhov
 */
public class ProcProductsRunner {

    public static void main(String[] args) {
        ProcProducts procProducts = new ProcProducts();
        procProducts.add(new Product("Lenovo", "notebook", 1000));
        procProducts.add(new Product("iPhone", "smartphone", 800));

        procProducts.print("CSV");
        System.out.println();

        procProducts.print("name");
    }
}
