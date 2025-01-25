import java.util.*;
public class ArrayPrintRecursive {
    public static void print(int [] a, int n){
        if(n==1){
            System.out.println(a[n-1]);
            return;
        }
        print(a,n-1);
        System.out.println(a[n-1]);

    }


    public static void main(String[] args) {
        int a[] ={1,3,4,5,3,2,1};
        print(a,7);
    }
    
}
