import java.util.*;

public class L2e2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Pick a number NOW");
        int num = input.nextInt();
        num = num*2;
        num = num/4;
        num = num-1;
        num = num%2;
        num = num +12;
        num = num^3;
        System.out.println(num);




    }
}
