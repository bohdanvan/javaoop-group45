package com.bvan.oop.lesson5.fs.oop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Directory extends NamedFSItem {

    private final List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public Directory() {
    }

    public Directory add(FSItem item) {
        items.add(item);
        return this;
    }

    public Directory add(Directory directory) {
        if (createsCyclicDependency(directory)) {
            throw new IllegalArgumentException("cyclic dependency");
        }
        return add((FSItem)directory);
    }

    private boolean createsCyclicDependency(Directory directory) {
        return this == directory; // TODO
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FSItem item : items) {
            size += item.getSize();
        }
        return size;
    }

    @Override
    public String toString() {
        return "d" + items;
    }
}
