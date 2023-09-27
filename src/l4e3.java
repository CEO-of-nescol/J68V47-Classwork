import java.util.Scanner;

public class l4e3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the cost of your order? ");
        float cost = input.nextFloat();

        float shipCost = 0;

        if(cost < 50) {
            shipCost = 10;
            System.out.println("Your shipping cost is £" + shipCost);
        } else {
            shipCost = 0;
            System.out.println("Your shipping cost is £" + shipCost);
        }
        float totalCost = cost + shipCost;

        System.out.print("Your final total cost is £" + totalCost);

    }

}
