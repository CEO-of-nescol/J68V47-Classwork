
import java.io.*;

public class l10epractice {

    public static void main(String[] args) {

    try{
        FileWriter out = new FileWriter("output.txt");


            out.write("Hello World");
            out.close();

        } catch (IOException e)
        {
            System.out.println("Error occurred writing to file: " + e.toString());

        }


    }
}
