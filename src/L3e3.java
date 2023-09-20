import java.util.Scanner;


public class L3e3 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the amount of the loan?");
        int amount = input.nextInt();
        System.out.println("What is the interest rate of the loan?");
        int interestRate = input.nextInt();
        System.out.println("What is number of years of the loan?");
        float years = input.nextInt();

        float interestMonth = interestRate/12;

        float years12 = years*12;

        float negyears12 = -years12;

        float amountInterest = amount + interestMonth;



        float variable = (float)Math.pow(amountInterest,negyears12);

        float monthlypay = amount*(interestMonth/(amount - variable));

        System.out.println("Loan amount: " + amount);

        System.out.println("Interest rate APR%: " + interestRate);

        System.out.println("Number of years" + years);

        System.out.println("Monthly Pay: £" + monthlypay);


    }
}
