import java.util.*;
public class ArrayMaximumRecursive {

    public static int max(int [] a, int n){
        if(n==0){
            return Integer.MIN_VALUE;
        }
        return Math.max(a[n-1], max(a,n-1));
    }

    public static void main(String[] args) {
        int a[] = {};
        int n = a.length;
        int ans = max(a,n);
        System.out.println(ans);
    }
    
}




