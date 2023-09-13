import java.util.Scanner;

public class L3e3 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the amount of the loan?");
        float amount = input.nextFloat();
        System.out.println("What is the interest rate of the loan?");
        float interestRate = input.nextFloat();
        System.out.println("What is number of years of the loan?");
        int years = input.nextInt();

        float monthlypay = amount((interestRate/12)/(amount+(interestRate/12)^(-(years*12))));


    }
}
