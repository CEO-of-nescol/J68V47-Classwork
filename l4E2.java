import java.util.Scanner;

class L4e2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Q1 What is the capital of spain? ");
        String response1 = input.nextLine();
        System.out.println(response1.toLowerCase().contains("madrid"));
        if (response1.toLowerCase().equals("madrid"))
            System.out.println("Correct");
        else
            System.out.println("Incorrect the answer is Madrid");
        System.out.println("Q2 What is the capital of the UK? ");
        String response2 = input.nextLine();
        if (response2.toLowerCase().equals("london"))
            System.out.println("Correct");
        else
            System.out.println("Incorrect the answer is London");

        System.out.println("Q3 What is the capital of Serbia? ");
        String response3 = input.nextLine();
        if (response3.toLowerCase().equals("sarajevo"))
            System.out.println("Correct");
        else
            System.out.println("Incorrect the answer is Sarajevo");

    }


}
