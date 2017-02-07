package com.bvan.oop.lesson5.fs.proc;

/**
 * @author bvanchuhov
 */
public class ProcFSRunner {

    public static void main(String[] args) {
        ProcDirectory d2 = new ProcDirectory();

        ProcDirectory d3 = new ProcDirectory()
                .add(new ProcFile(50));

        ProcDirectory d1 = new ProcDirectory()
                .add(new ProcFile(30))
                .add(new ProcFile(40))
                .add(d3);

        ProcDirectory root = new ProcDirectory()
                .add(new ProcFile(10))
                .add(new ProcFile(20))
                .add(d1)
                .add(d2);

        System.out.println(root.getSize());
    }
}
