import java.util.Scanner;
public class l7e2 {

        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number to be added");

        int input1 = scanner.nextInt();

        System.out.println("Input the second number to be added");

        int input2 = scanner.nextInt();

        int finishedSum = calculateSum( input1, input2);
        System.out.println("The sum is " + finishedSum);

    }
    public static int calculateSum(int input2,int input1) {
        int finishedSum = input1 + input2;
        return finishedSum;
    }
}

