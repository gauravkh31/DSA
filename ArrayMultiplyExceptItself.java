import java.util.*;
public class ArrayMultiplyExceptItself {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int n = a.length;

        int r[] = new int[n];
        r[n-1] = a[n-1];
        for(int i = n-2; i >= 0; i--){
            r[i] = a[i]*r[i+1];
        }
        for(int i = 0; i < r.length; i++){
            System.out.print(r[i]+ " ");
        }
System.out.println();
        int ans[] = new int[n];
        int left =1; 
        
        for(int i = 0; i < ans.length-1; i++){
            ans[i] = left*r[i+1];
            left = left*a[i];
        }
        ans[n-1] = left;
        for(int i =0; i < ans.length; i++){
            System.out.print(ans[i]+" ");

        }
    }
    
}
