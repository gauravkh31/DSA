import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns");
        int c = sc.nextInt();
        
        int a[][] = new int[r][c];
        System.out.println("Enter array elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered array is:");
        for (int p = 0; p < r; p++) {
            for (int q = 0; q < c; q++) {
                System.out.print(a[p][q] + " ");
            }
            System.out.println();
        }

        int tr = 0, br = r - 1, lc = 0, rc = c - 1;
        int n = 0;
        
        while (n < r * c) {
            // Traverse from left to right
            for (int j = lc; j <= rc && n < r * c; j++) {
                System.out.print(a[tr][j] + " ");
                n++;
            }
            tr++;

            // Traverse from top to bottom
            for (int i = tr; i <= br && n < r * c; i++) {
                System.out.print(a[i][rc] + " ");
                n++;
            }
            rc--;

            // Traverse from right to left
            for (int j = rc; j >= lc && n < r * c; j--) {
                System.out.print(a[br][j] + " ");
                n++;
            }
            br--;

            // Traverse from bottom to top
            for (int i = br; i >= tr && n < r * c; i--) {
                System.out.print(a[i][lc] + " ");
                n++;
            }
            lc++;
        }
        sc.close();
    }
}
