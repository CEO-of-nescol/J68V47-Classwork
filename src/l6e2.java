import java.util.Scanner;
public class l6e2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option;
        {
            System.out.println("1.    Say Hello ");
            System.out.println("2.    Tell me the time ");
            System.out.println("3.    Tell me a joke ");
            System.out.println("4.    Quit ");
            System.out.println("Enter an option 1-4: ");
            option = input.nextInt();
            System.out.println("Option selected " + option);
            while(option !=4);
        }

    }
}