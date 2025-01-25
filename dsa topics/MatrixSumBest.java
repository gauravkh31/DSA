import java.util.*;
class MatrixSumBest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no. of rows:");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns:");
        int c = sc.nextInt();
        int [][] a = new int[r][c];
        System.out.println("Enter array elements:");
        for(int i = 0; i<r; i++){
            for(int j = 0 ; j < c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Your enterd matrix is :");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c ; j++){
                System.out.print(a[i][j]+ " ");
            }
            
            System.out.println();
        }
        
        System.out.println("Enter x1");
        int x1 = sc.nextInt();
        System.out.println("Enter y1");
        int y1 = sc.nextInt();
        System.out.println("Enter x2:");
        int x2 = sc.nextInt();
        System.out.println("Enter y2:");
        int y2 = sc.nextInt();
        
        for(int i =0 ;i<r; i++){
            for(int j = 1; j<c; j++){
                a[i][j] += a[i][j-1];
            }
        }
           System.out.println("Your prefix sum horizontally matrix is :");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c ; j++){
                System.out.print(a[i][j]+ " ");
            }
            
            System.out.println();
        }
        
        for(int j = 0; j < c; j++){
            for(int i = 1; i < r; i++){
                a[i][j] += a[i-1][j];
            }
        }
        
         System.out.println("Your prefix sum vertically matrix is :");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c ; j++){
                System.out.print(a[i][j]+ " ");
            }
            
            System.out.println();
        }
        
        if(x1!=0&&y1==0){
          int   sum = a[x2][y2]-a[x1-1][y2];
          System.out.println("The sum is: "+sum);
          sc.close();
          return;

        }

        if(y1!=0&&x1==0){
            int sum1 = a[x2][y2]-a[x2][y1-1];
            System.out.println("The sum is: "+sum1);
            sc.close();
            return;

        }
        if(y1==0&&x1==0){
            int sum2 = a[x2][y2];
            System.out.println("The sum is: "+sum2);
            sc.close();
            return;

        }
        
        int sum3 = a[x2][y2] - a[x2][y1-1] - a[x1-1][y2] + a[x1-1][y1-1];
        System.out.println("The sum is: "+sum3);

        sc.close();
    }
}