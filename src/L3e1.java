import java.util.Scanner;

public class L3e1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your firstname?");
        String fname = input.nextLine();

        System.out.println("What is your surname?");
        String sname = input.nextLine();

        System.out.println("What is your year of birth?");
        int birthyear = input.nextInt();

        String username = fname.substring(0,1) + sname;
        System.out.println("your username is " + username);

        String pword = sname.substring(0,1).toLowerCase() + fname.substring(0,3).toUpperCase() + birthyear;

        System.out.println("Your password is " + pword);
    }

}
