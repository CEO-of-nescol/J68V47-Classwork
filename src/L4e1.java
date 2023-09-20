import java.util.Scanner;
public class L4e1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First name: ");
        String fname = input.nextLine();

        System.out.println("Last name: ");
        String sname = input.nextLine();

        System.out.println("Order value: ");
        Float value = input.nextFloat();

        System.out.println("Deposit: ");
        Float deposit = input.nextFloat();

        System.out.println("=== RECEIPT ===");

        System.out.println("Customer: " + fname.substring(0) + " " + sname);

        System.out.println("Order total: " + value);

        System.out.println("Deposit paid: " + deposit);

        Float remainder = value - deposit;

        System.out.println("Remainder: " + remainder);

        if (deposit > 100) {
            System.out.println("You get a free toaster!");
        }
        System.out.println("Have a nice day");



    }

}
