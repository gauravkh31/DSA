import java.util.*;
public class ArraySumRecursive {

    public static int sum(int [] a, int n){
        if(n==0){
            return 0;
        }
        return a[n-1]+sum(a,n-1);
        
    }

    public static void main(String[] args) {
        int a[] = {2,3,5,20,1};
        int n = a.length;
        int ans = sum(a,n);
        System.out.println(ans);
    }
    
}


