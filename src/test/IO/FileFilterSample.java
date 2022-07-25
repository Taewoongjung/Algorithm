package test.IO;

import java.io.File;

public class FileFilterSample {
    public static void main(String[] args) {
        FileFilterSample sample = new FileFilterSample();
        String pathName = File.separator + "SPRING" + File.separator + "text";
        sample.checkList(pathName);
    }

    public void checkList(String pathName) {
        File file;
        try {
            file = new File(pathName);
            File[] mainFileList = file.listFiles();
            for (File tempFIle : mainFileList) {
                System.out.println(tempFIle.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
