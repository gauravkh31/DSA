import java.util.*;
public class ArraySum2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows");
        int r = sc.nextInt();
        System.out.println("Enter no of columns");
        int c = sc.nextInt();
        int a [][] = new int[r][c];
        int b[][] = new int[r][c];

        System.out.println("Enter values for array 1: ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0; j < c;j++){
                a[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter values for array 2: ");
        for(int p = 0 ; p < r ; p++){
            for(int q = 0; q < c;q++){
                b[p][q] = sc.nextInt();
            }
        }

        System.out.println("The values for array 1: ");
        for(int p = 0 ; p < r ; p++){
            for(int q = 0; q < c;q++){
                System.out.print(a[p][q]+" ");
            }
            System.out.println();
        }


        System.out.println("The  values for array 2: ");
        for(int p = 0 ; p < r ; p++){
            for(int q = 0; q < c;q++){
                System.out.print(b[p][q]+" ");
            }
            System.out.println();
        }


        int sum[][] = new int[r][c];

        for(int i = 0; i < r;i++){
            for(int j = 0; j < c;j++){
                sum[i][j] = a[i][j]  +  b[i][j];            }
        }

        System.out.println("The sum array is:");
        
        for(int i = 0; i < r;i++){
            for(int j = 0; j < c;j++){
                System.out.print(sum[i][j]+" ");          }
                System.out.println();
        }








        sc.close();
    }
    
}
