import java.io.*;
public class l10e2 {

    public static void main(String[] args) {


        try {
            BufferedReader in = new BufferedReader(new FileReader("timesTable.txt"));
            String line = in.readLine();
            while (line != null) {
                line = in.readLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());

        }


    }
}


