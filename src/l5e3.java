import java.util.Scanner;
public class l5e3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        for( int count=1; count<=10; count+=1) {
            System.out.println("What is 5 x " + count);
            int answer = input.nextInt();
            if (answer == (5*count))
            {
                score = score+1;
                System.out.println("Correct");
            }
            else {
                System.out.println("Incorrect, the answer is " + 5*count);
            }
        }

        System.out.println("Your total score is " + score + "/10");


    }
}
