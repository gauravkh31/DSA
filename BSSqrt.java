public class BSSqrt {


    
    public static int sqrt(int n){
        int ans =-1;
        int s = 0;
        int e = n;
        while(s<=e){

            int mid = s+ (e-s)/2;
            if(mid*mid==n){
             return mid;

    }
            if(mid*mid<n){
                ans = mid;
                s=mid+1;
            }
            if(mid*mid>n){
                e = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int n = 29;
        int ans = sqrt(n);
        System.out.println(ans);
        
    }
    
}
