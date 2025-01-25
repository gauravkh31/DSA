import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of triangle:");
        int n = sc.nextInt();
        int [][] m = new int[n][n];

        for(int i = 0; i< n ; i++){
            m[i][0] = 1;
            m[i][i] = 1;
            for(int j = 1 ;j <= i-1; j++){
                m[i][j] = m[i-1][j-1] + m[i-1][j];
            }
        }

        System.out.println("Your pascal triangle is: ");
        for(int i =0 ; i < n ; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }






        sc.close();
    }
}
