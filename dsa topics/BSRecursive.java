import java.util.*;
public class BSRecursive{



    public static int bs(int a[], int s ,int e, int target){
            if(s<=e){
                int mid = s + (e-s)/2;
            

            if(target==a[mid]){
                return mid;

            }
             if(target < a[mid]){
                return bs(a,s,mid-1, target);
            }
            if(target>a[mid]){
                return bs(a, mid +1, e, target);
            }

        
            }
            return -1;
        }
    public static void main(String[] args) {

        int a[] = {2,3,4,5,6,7,90,400};
        int ans = bs(a,0,a.length-1, 67);
        System.out.println(ans);
        
    }
}