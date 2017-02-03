package com.bvan.oop.lesson4.product.proc;

import com.bvan.oop.lesson4.product.Product;

import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ProcProducts {

    private final List<Product> products = new LinkedList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(String format) {
        for (Product product : products) {
            String s = formatProduct(format, product);
            System.out.println(s);
        }
    }

    private String formatProduct(String format, Product product) {
        switch (format) {
            case "CSV":
                return formatToCsv(product);
            case "name":
                return formatToName(product);
            default:
                throw new IllegalArgumentException("illegal format");
        }
    }

    private String formatToName(Product product) {
        return product.getName();
    }

    private String formatToCsv(Product product) {
        return formatToName(product) + ";"
                + product.getDesc() + ";"
                + product.getPrice();
    }
}
