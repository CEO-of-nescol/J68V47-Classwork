import java.util.Scanner;

public class L5e1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Input a base number ");;
    int base = input.nextInt();

    for( int count=1; count<13; count++)
    {
        float result = base*count;
        System.out.println(base + " x " + count + " = " + result);
    }
    }


}
