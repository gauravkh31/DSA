import java.util.*;
public class BSFirstOccur {

    public static int fc(int []a, int s, int e, int target){
        int ans =-1;
        while(s<=e){

            int mid = s+ (e-s)/2;
            if(a[mid]==target){
                 ans = mid;
                 e = mid-1;
            }
            if(a[mid]<target){
                s=mid+1;
            }
            if(a[mid]>target){
                e = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int a[] = {2,5,5,5,6,6,6,7,7,7,8,8};
        int ans = fc(a,0,a.length-1, 0);
        System.out.println(ans);
        
    }
    
}
