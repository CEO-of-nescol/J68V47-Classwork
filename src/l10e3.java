import java.io.*;
import java.util.Scanner;
public class l10e3 {

    public static void main(String[] args) {

        Integer total = 0;

        try {
            try (Scanner in = new Scanner(new FileReader("integers.txt"))) {
                Integer line = in.nextInt();

                while (line != null) {
                    try {
                        line = in.nextInt();
                    } catch (Exception e) {
                        System.out.println(e.toString());
                        line = null;
                    }
                    if (line != null) {
                        total = total + line;
                    }
                }

            }
            System.out.println(total);
            } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e);

        }
    }
}
