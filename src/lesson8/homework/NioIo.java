package lesson8.homework;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class NioIo {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*File file = new File("io/readme.txt");
        System.out.println("File exists: " + file.exists());
        System.out.println("File created: " + file.createNewFile());
        System.out.println("Is this a file: " + file.isFile());
        System.out.println("Is this a package: " + file.isDirectory());*/

        /*File file = new File("io", "child");
        System.out.println("File exists: " + file.exists());
        System.out.println("Package created: " + file.mkdir());

        File file2 = new File("io", "child/child2/child3");
        System.out.println("File exists: " + file2.exists());
        System.out.println("Packages created: " + file2.mkdirs());*/

        /*File file = new File("io", "child4/child5");
        System.out.println("File exists: " + file.exists());
        System.out.println("Package created: " + file.mkdirs());
        System.out.println("Is this package aviable: " + file.canExecute());
        file.deleteOnExit();

        System.out.println("File address: " + file.getAbsoluteFile());
        System.out.println("File address string: " + file.getAbsolutePath());
        System.out.println("File address: " + file.getCanonicalFile());
        System.out.println("File address string: " + file.getCanonicalPath());

        System.out.println("Parent file: " + file.getParentFile());
        System.out.println("Parent files name: " + file.getParent());*/

        /*File file = new File("io", "readme.txt");
        System.out.println("File exists: " + file.exists());
        System.out.println("File created: " + file.createNewFile());
        System.out.println("File length: " + file.length());
        System.out.println("File name: " + file.getName());
        System.out.println("File address: " + file.getPath());
        System.out.println("Edited date: " + new Date(file.lastModified()));
        System.out.println("Is edited: " + file.setLastModified(3000));
        System.out.println("Delete file: " + file.delete());
        file.deleteOnExit();*/

        File file = new File("io", "readme.txt");
        System.out.println("File exists: " + file.exists());

        System.out.println(file.setReadable(false));

        if (file.canRead()) {
            System.out.println("I can read file");
        } else {
            System.err.println("I can't read file");
        }


    }
}
