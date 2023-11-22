import java.io.*;
import java.util.Scanner;
public class l10e1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a number in for its times tables");
        int answer = input.nextInt();


            try {
                FileWriter out = new FileWriter("timesTable.txt");
                for (int count = 1; count <= 12; count += 1) {
                    Integer tableOutput = answer * count;
                    out.write( count + " x " + answer + " = " + tableOutput.toString());
                    out.write("\n");
                }
                out.close();
            } catch (IOException e) {
                System.out.println("Error occurred writing to file: " + e.toString());

            }


        }
    }


