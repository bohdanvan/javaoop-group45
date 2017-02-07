package com.bvan.oop.lesson5.fs.proc;

/**
 * @author bvanchuhov
 */
public class ProcSimpleFSRunner {

    public static void main(String[] args) {
        ProcFile file = new ProcFile(10);
        System.out.println(file);
        System.out.println("size = " + file.getSize());
        System.out.println();

        ProcDirectory directory = new ProcDirectory()
                .add(file)
                .add(new ProcFile(20))
                .add(new ProcFile(30));

        System.out.println("Dir:");
        System.out.println(directory);
        System.out.println("size = " + directory.getSize());
    }
}
