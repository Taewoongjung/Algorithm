package test.IO;

import java.io.File;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "알고리즘공부/core";
        sample.checkPath(pathName);
    }

    public void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " exits? = " + file.isDirectory());
        System.out.println(pathName + " exits? = " + file.isFile());
    }
}
