import java.io.*;
import java.util.Scanner;
public class l10e4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the first file?");
        String file1 = input.nextLine();
        System.out.println("What is the name of the second file?");
        String file2 = input.nextLine();
        try {
            BufferedReader in = new BufferedReader(new FileReader(file1));

            String line1 = in.readLine();
            while (line1 != null) {
                line1 = in.readLine();

            }
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());}

        try {
            BufferedReader in = new BufferedReader(new FileReader(file2));
            String line2 = in.readLine();
            while (line2 != null) {
                line2 = in.readLine();

            }

        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());

        }


    }
}