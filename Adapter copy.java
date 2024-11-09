package Problem3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Adapter {
    public void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Problem3/Problem3_data.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
