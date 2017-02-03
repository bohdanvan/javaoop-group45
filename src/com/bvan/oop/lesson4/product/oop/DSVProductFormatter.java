package com.bvan.oop.lesson4.product.oop;

import com.bvan.oop.lesson4.product.Product;

/**
 * @author bvanchuhov
 */
public class DSVProductFormatter implements ProductFormatter {

    private final String delimiter;

    public DSVProductFormatter(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String format(Product product) {
        return product.getName() + delimiter
                + product.getDesc() + delimiter
                + product.getPrice();
    }
}
