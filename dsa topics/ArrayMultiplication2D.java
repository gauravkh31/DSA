import java.util.*;
public class ArrayMultiplication2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows for matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter no of columns for matrix 1");
        int c1 = sc.nextInt();
        System.out.println("Enter no. of rows for matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter no of columns for matrix 2");
        int c2 = sc.nextInt();

        if(c1!=r2){
            System.out.println("Wrong input: ");
            return;}else{
        int a [][] = new int[r1][c1];
        int b[][] = new int[r2][c2];

        System.out.println("Enter values for array 1: ");
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0; j < c1;j++){
                a[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter values for array 2: ");
        for(int p = 0 ; p < r2 ; p++){
            for(int q = 0; q < c2;q++){
                b[p][q] = sc.nextInt();
            }
        }

        
        System.out.println("The values for array 1: ");
        for(int p = 0 ; p < r1 ; p++){
            for(int q = 0; q < c1;q++){
                System.out.print(a[p][q]+" ");
            }
            System.out.println();
        }


        System.out.println("The  values for array 2: ");
        for(int p = 0 ; p < r2 ; p++){
            for(int q = 0; q < c2;q++){
                System.out.print(b[p][q]+" ");
            }
            System.out.println();
        }
        int [][] mul = new int[r1][c2];

        for(int i =0; i < r1; i++){
            for(int j =0 ; j< c2; j++){
                for(int k  =0 ; k < c1; k++){
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Final array is:");
        for(int p = 0 ; p < r1 ; p++){
            for(int q = 0; q < c2;q++){
                System.out.print(mul[p][q]+" ");
            }
            System.out.println();
        }


    }
    }
}
