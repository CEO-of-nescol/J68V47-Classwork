//stored ideas
//Mateusz Siwiec
//16/11/2023


import java.util.Scanner;
public class Project_prototypes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double alcohol = 60;

        int hour = 1;
        // alcohol is measured in milliliters in this program*-
        double metabolismRate = 100*hour;

        double soberTime = alcohol/metabolismRate;


        System.out.print(soberTime);
    }
}
//      try {
//            File file = new File("alcohol_unit_values.txt");
//              Scanner scanner = new Scanner(file);


//                List<String> alcohols= new ArrayList<String>();

// while (scanner.hasNextLine()) {
//    String line = scanner.nextLine();
//      alcohols.add(line);
//        for (int count = 1; count <= 9; count += 1) {


//          }
//        }

//          System.out.println(alcohols);
//            scanner.close();
//          } catch (FileNotFoundException e) {
//                System.out.println("Error reading alcohol unit values from the file.");
//            }

