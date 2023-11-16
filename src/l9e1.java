import java.util.Scanner;

public class l9e1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String response = scanner.nextLine();

        int length = response.length();
        for (int i = 10; i >=  length; i--) {
            String character = response.substring(0, 1);
            response = response.substring(1, length);
            length = response.length();
            System.out.print(character);
        }
    }
}