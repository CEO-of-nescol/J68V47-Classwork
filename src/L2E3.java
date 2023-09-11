
import java.util.*;

public class L2E3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Name of item 1");
        String name1 = input.nextLine();

        System.out.println("Name of item 2");
        String name2 = input.nextLine();

        System.out.println("Name of item 3");
        String name3 = input.nextLine();

        System.out.println("Price of item 1");
        float price1 = input.nextFloat();

        System.out.println("Price of item 2");
        float price2 = input.nextFloat();

        System.out.println("Price of item 3");
        float price3 = input.nextFloat();

       float subtotal = price1 + price2 + price3;

        System.out.println("NESMART");
        System.out.format("\nItem 1 " + name1 + " £%.2f", price1);
        System.out.format("\nItem 2 " + name2 + " £%.2f", price2);
        System.out.format("\nItem 3 " + name3 + " £%.2f", price3);
        System.out.println("\nSUBTOTAL..£" + subtotal);
    }

}
