//Alcohol Unit Calculator
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
