import java.util.Scanner;


public class L3e3 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the amount of the loan?");
        int amount = input.nextInt();
        System.out.println("What is the interest rate of the loan?");
        int interestRate = input.nextInt();
        System.out.println("What is number of years of the loan?");
        int years = input.nextInt();

        int interestMonth = interestRate/12;

        int years12 = years*12;

        int negyears12 = -years12;

        int amountInterest = amount + interestMonth;



        int variable = Math.pow(amountInterest,negyears12);

        int monthlypay = amount*(interestMonth/(amount - variable));

    //    System.out.println("Loan amount: " + amount);

     //   System.out.println("Interest rate APR%: " + interestRate);

      //  System.out.println("Number of years")


    }
}
