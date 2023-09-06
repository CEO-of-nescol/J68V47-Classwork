import java.util.*;

public class Printing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("What is your hobby?");
        String hobby = input.nextLine();

        System.out.print(name + " was enjoying some " + hobby + " then " + name + " said, " + "\n" + " Its " + hobby + "ing time! and " + hobby + "ed all over the place" );
    }
}
