import java.util.Scanner;

public class L3e2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Q1 What is the capital of spain? ");
        String response1 = input.nextLine();
        System.out.println(response1.toLowerCase().contains("madrid"));

        System.out.println("Q2 What is the capital of the UK? ");
        String response2 = input.nextLine();
        System.out.println(response2.toLowerCase().contains("london"));

        System.out.println("Q3 What is the capital of Serbia? ");
        String response3 = input.nextLine();
        System.out.println(response3.toLowerCase().contains("sarajevo"));

    }


}
