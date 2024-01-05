package catfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/java/catfile/file/cat.txt";
        for (Cat cat : listCat(path)) {
            System.out.println(cat.toString());
        }

    }

    public static List<Cat> listCat(String path) {

        List<Cat> catList = new ArrayList<>();
        File catFile = new File(path);

        try (BufferedReader br = new BufferedReader(new FileReader(catFile))) {
            String st = br.readLine();
            while (st != null) {
                String[] catInfo = st.split(" ");

                String name = catInfo[0];

                isDouble(catInfo[1]);
                double weight = Double.parseDouble(catInfo[1]);

                isInteger(catInfo[2]);
                int frequencyPurr = Integer.parseInt(catInfo[2]);

                catList.add(new Cat(name, weight, frequencyPurr));
                st = br.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error - " + e);
        }
        return catList;
    }

    public static boolean isInteger(String st) {
        try {
            Integer.parseInt(st);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String st) {
        try {
            Double.parseDouble(st);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
