import java.util.*;
public class StackCopyToAnother {
    public static void main(String[] args) {
        Stack  <Integer> st1 = new Stack<>();
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements to insert: ");
        n = sc.nextInt();
        System.out.println("Enter the elements: ");
        while(n>0){
            int x = sc.nextInt();
            st1.push(x);
            n--;

        }
        System.out.println("St1 is: ");
        System.out.println(st1);
        Stack <Integer> st2 = new Stack<>();
        while(st1.size()>0){
            int y = st1.pop();
            st2.push(y);
        }
        System.out.println(st2);
        Stack <Integer> st3 = new Stack<>();
        while(st2.size()>0){
            int y = st2.pop();
            st3.push(y);
        }
        System.out.println(st3);
    }
}