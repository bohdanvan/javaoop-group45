package com.bvan.oop.lesson5.fs.oop;

/**
 * @author bvanchuhov
 */
public class FSRunner {

    public static void main(String[] args) {
        Directory d2 = new Directory();

        Directory d3 = new Directory()
                .add(new File(50));

        Directory d1 = new Directory()
                .add(new File(30))
                .add(new File(40))
                .add(d3);

        Directory root = new Directory()
                .add(new File(10))
                .add(new File(20))
                .add(d1)
                .add(d2)
                .add(new Symlink())
                .add(new Symlink());

        System.out.println(root.getSize());
    }
}
