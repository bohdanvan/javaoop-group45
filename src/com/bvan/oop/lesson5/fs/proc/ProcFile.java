package com.bvan.oop.lesson5.fs.proc;

/**
 * @author bvanchuhov
 */
public class ProcFile {

    private int size;

    public ProcFile(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "f(" + size + ")";
    }
}
