import java.util.*;

public class crt8 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        // int a [] = {2,3,4,5,6};
        // for(int i =0; i< a.length; i++){
        // q.add(a[i]);
        // }
        // System.out.println(q);
        // System.out.println(q.peek());
        // q.remove();
        // System.out.println(q.peek());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        // System.out.println("Enter n elements ");

        // for (int i = 1; i <= n; i++) {
        //     int p = sc.nextInt();
        //     q.add(p);
        // }

        // System.out.println("Enter value of k ");
        // int k = sc.nextInt();

        // Stack<Integer> st = new Stack<>();

        // for (int i = 1; i <= k; i++) {
        //     st.push(q.remove());
        // }
        // for (int i = 1; i <= k; i++) {
        //     q.add(st.pop());
        // }
        // for (int i = 1; i <= (n - k); i++) {
        //     int z = q.remove();
        //     q.add(z);
        // }

        // System.out.println(q);
        q.add("1");
        for(int i = 1; i <= n; i++){
            
           String current =  q.remove();
           System.out.println(current+" ");
           q.add(current+"0");
           q.add(current+"1");

        }

    }

}
