package testfile;

import file.FileJava;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


import org.junit.jupiter.api.Assertions;


public class TestFileJava {

    @Test
    public void testCreateFile() throws Exception {
        FileJava.createFile();
        for (int i = 1; i <= 10; i++) {
            File file = new File("C:\\Users\\zverk\\IdeaProjects\\FileJava\\src\\main\\java\\file\\data\\" + i + ".txt");
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