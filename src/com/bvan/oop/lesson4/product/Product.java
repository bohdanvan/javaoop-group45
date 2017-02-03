package com.bvan.oop.lesson4.product;

/**
 * @author bvanchuhov
 */
public class Product {

    private final String name;
    private final String desc;
    private final long price;

    public Product(String name, String desc, long price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
