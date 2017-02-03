package com.bvan.oop.lesson4.product.oop;

import com.bvan.oop.lesson4.product.Product;
import com.bvan.oop.lesson4.product.oop.ProductFormatter;

/**
 * @author bvanchuhov
 */
public class ProductNameFormatter implements ProductFormatter {

    @Override
    public String format(Product product) {
        return product.getName();
    }
}
