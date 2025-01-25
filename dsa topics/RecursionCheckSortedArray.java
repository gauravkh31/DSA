import java.util.*;
public class RecursionCheckSortedArray {
    public static boolean check(int [] a, int n){
        if(n==a.length-1) return true;

        
        if(a[n]>a[n+1]) return false;
        return check(a,n+1);
       

    }





    public static void main(String[] args) {
        int [] a = {2,3,5,6,8,1};
        System.out.println(check(a,0));
    }
    
}
