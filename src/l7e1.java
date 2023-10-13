

import java.util.Scanner;
public class l7e1 {


    public static void message(String message){
        System.out.println(message);
    }

    public static void option1(){
        System.out.println("HELLO!");
    }
    public static void option2(){
        System.out.println("The time is now.");
    }
    public static void option3(){
        System.out.println("Knock knock. Who's there? ....... long pause ........ Java");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            message("Menu");
            message("1. Say hello");
            message("2. Tell me the time");
            message("3. Tell me a joke");
            message("4. Quit");

            message("Input an option (1-4): ");

            option = getOption();

            System.out.format("You chose option %d %n", option);
            if (option == 1){
                option1();
            } else if (option == 2){
                option2();
            } else if (option == 3){
                option3();
            } else if (option == 4){
                message("Bye!");
            } else {
                message("This isn't a valid option. Try a number between 1 and 4.");
            }

        } while (option != 4);


    }

    private static int getOption() {
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        return option;
    }


}
