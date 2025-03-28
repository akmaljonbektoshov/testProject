package lesson9;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("io/readme.txt");
        System.out.println(file.createNewFile());
    }
}
