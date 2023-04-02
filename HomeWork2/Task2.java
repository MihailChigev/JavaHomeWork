package HomeWork2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task2 {
    public static void main(String[] args) {
            String str = "TEST";
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                result.append(str).append(System.lineSeparator());
            }
    
            try(PrintWriter pw = new PrintWriter("file.txt")) {
            pw.print(result);
            }catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }
