import java.util.Scanner;

public class ArrangeInSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter no. of rows");
        // int r = sc.nextInt();
        // System.out.println("Enter no. of columns");
        // int c = sc.nextInt();

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        
        int a[][] = new int[n][n];
        // System.out.println("Enter array elements:");
        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         a[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("Entered array is:");
        // for (int p = 0; p < r; p++) {
        //     for (int q = 0; q < c; q++) {
        //         System.out.print(a[p][q] + " ");
        //     }
        //     System.out.println();
        // }

        int tr = 0, br = n - 1, lc = 0, rc = n - 1;
        int number = 1;
        
        while (number <= n*n) {
            // Traverse from left to right
            for (int j = lc; j <= rc && n < n*n; j++) {
                a[tr][j] = number;
                number++;
            }
            tr++;

            // Traverse from top to bottom
            for (int i = tr; i <= br && n < n*n; i++) {
                a[i][rc] = number;
                number++;
            }
            rc--;

            // Traverse from right to left
            for (int j = rc; j >= lc && n < n*n; j--) {
                a[br][j] = number;
                number++;
            }
            br--;

            // Traverse from bottom to top
            for (int i = br; i >= tr && n <n*n; i--) {
                a[i][lc] = number;
                number++;
            }
            lc++;
        }
        System.out.println("Spiral array is:");
        for (int p = 0; p < n; p++) {
            for (int q = 0; q < n; q++) {
                System.out.print(a[p][q] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
