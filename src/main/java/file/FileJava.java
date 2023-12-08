package file;

import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class FileJava {

    public static final Logger logger = Logger.getLogger(FileJava.class.getName());

    public static void createFile() throws Exception {
        Random random = new Random();
        for (int i = 1; i <= 10 ; i++) {
            File myFile = new File("C:\\Users\\zverk\\IdeaProjects\\FileJava\\src\\main\\java\\file\\data\\"+i+".txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile));
            bufferedWriter.write(String.valueOf(random.nextInt(1000)));
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(random.nextInt(1000)));
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(random.nextInt(1000)));
            bufferedWriter.close();
        }
    }

    public static void sumNumberInTwoFile() throws Exception{
        Random random = new Random();
        int sum = 0;
        for (int i = 1; i <= 2 ; i++) {
            int n = random.nextInt(10);
            //logger.info("n = " + n);
            File path = new File("C:\\Users\\zverk\\IdeaProjects\\FileJava\\src\\main\\java\\file\\data\\"+ n +".txt");
            BufferedReader br = new BufferedReader(new FileReader(path));
            String st = br.readLine();
            int count = 0;

            while (st != null) {
                count++;
                logger.info("Число которое в файле -> " + st);
                isInteger(st);
                sum = sum + Integer.parseInt(st);
                st = br.readLine();
            }
            logger.info(String.valueOf(count));
            assert count == 3 : "В файле не достаточно чисел!!";
            br.close();
        }
        logger.info("sum = " + sum);
    }

    public static boolean isInteger(String st) {
        try {
            Integer.parseInt(st);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        //createFile();
        sumNumberInTwoFile();
    }
}
