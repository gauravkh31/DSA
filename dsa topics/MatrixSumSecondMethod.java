import java.util.*;
public class MatrixSumSecondMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns");
        int c = sc.nextInt();
int a[][] = new int[r][c];
        System.out.println("Enter array elements: "
        );
        for(int i =0 ; i< r; i++){
            for(int j =0; j < c; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered array is:");
        for(int p = 0 ; p < r ; p++){
            for(int q = 0; q < c;q++){
                System.out.print(a[p][q]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter value of x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter value of y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter value of x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter value of y2: ");
        int y2 = sc.nextInt();
        int sum = 0;
        for(int i =0 ;i < r; i++ ){
            for(int j = 1; j < c; j++){
                a[i][j] += a[i][j-1];
            }
        }







        System.out.println("Prefix sum horizontally array is:");
        for(int p = 0 ; p < r ; p++){
            for(int q = 0; q < c;q++){
                System.out.print(a[p][q]+" ");
            }
            System.out.println();
        }

        for(int i = x1; i <= x2; i++){
            sum = sum + a[i][y2] - a[i][y1-1];

        }


        System.out.println("The sum of rectangle is : "+ sum);




        sc.close();
    }
    
}

  