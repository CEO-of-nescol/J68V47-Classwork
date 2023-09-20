import java.util.Scanner;
public class l4e3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the cost of your order? ");
        float cost = input.nextFloat();

        if(cost < 50)
            System.out.println("Your shipping cost is £10.00");
        else
            System.out.println("Your shipping cost is £0.00");

        }

    }
