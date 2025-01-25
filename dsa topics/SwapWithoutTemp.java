
import java.util.*;
public class SwapWithoutTemp {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to swap them:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a+b;
        b =  a-b;
        a = a-b;

        System.out.println("After swapping two numbers are: ");
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
