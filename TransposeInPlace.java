import java.util.*;
public class TransposeInPlace {
    public static void swap(int [][] a, int  i, int j){
        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
    }
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

        
        for(int i =0 ; i< r; i++){
            for(int j =i+1 ; j < c; j++){
                swap(a,i,j);
            }
        }


        System.out.println("Transposed array is:");
        for(int p = 0 ; p < r ; p++){
            for(int q = 0; q < c;q++){
                System.out.print(a[p][q]+" ");
            }
            System.out.println();
        }










        sc.close();
    }
    
}
