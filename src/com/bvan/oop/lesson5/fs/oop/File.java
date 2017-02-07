package com.bvan.oop.lesson5.fs.oop;

/**
 * @author bvanchuhov
 */
public class File extends NamedFSItem {

    private final int size;

    public File(String name, int size) {
        super(name);
        checkSize(size);
        this.size = size;
    }

    public File(int size) {
        this("unnamed", size);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "f(" + size + ")";
    }

    private void checkSize(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("not positive size: " + size);
        }
    }
}
