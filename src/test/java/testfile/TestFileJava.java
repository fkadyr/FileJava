package testfile;

import file.FileJava;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


import org.junit.jupiter.api.Assertions;


class TestFileJava {


    @Test
    void testCreateFile() throws Exception {
        String path = "src/main/java/file/data/";
        FileJava.createFile(path);
        for (int i = 1; i <= 10; i++) {
            File file = new File(path + i + ".txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st = br.readLine();
            int count = 0;
            while (st != null) {
                count++;
                st = br.readLine();
            }
            Assertions.assertEquals(3, count);
            Assertions.assertTrue(file.exists());
        }
    }
}