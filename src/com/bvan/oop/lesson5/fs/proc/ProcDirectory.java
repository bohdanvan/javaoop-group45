package com.bvan.oop.lesson5.fs.proc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ProcDirectory {

    private final List<ProcFile> files = new ArrayList<>();
    private final List<ProcDirectory> directories = new ArrayList<>();

    public ProcDirectory add(ProcFile file) {
        files.add(file);
        return this;
    }

    public ProcDirectory add(ProcDirectory directory) {
        if (createsCyclicDependency(directory)) {
            throw new IllegalArgumentException("cyclic dependency");
        }
        directories.add(directory);
        return this;
    }

    private boolean createsCyclicDependency(ProcDirectory directory) {
        return this == directory; // TODO
    }

    public int getSize() {
        int size = 0;
        for (ProcFile file : files) {
            size += file.getSize();
        }
        for (ProcDirectory directory : directories) {
            size += directory.getSize();
        }
        return size;
    }

    @Override
    public String toString() {
        return "d{files=" + files + ", dirs=" + directories + "}";
    }
}
