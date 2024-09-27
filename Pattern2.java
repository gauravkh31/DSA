import java.util.*;
public class Pattern2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int k= 1; k <=i-1 ; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <=n-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
