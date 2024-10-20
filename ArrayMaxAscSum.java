import java.util.*;
public class ArrayMaxAscSum {
    public static int sum(int [] a,int n){
        if(n==1){
            return a[0];
        }
        if(n==2){
            if(a[0]<a[1]){
                return a[0]+a[1];
            }else{
                return a[0];
            }
        }

        int sum =a[0]; 
        int mSum = a[0]; 
        int i =0; 
        int j = 1; 
       
        while(j<n){
            if(a[j]>a[i]){
                 sum += a[j];
              
            }else{
                if(sum > mSum){
                    mSum = sum;
                }
                sum=a[j];
                i = j;
              
            }
            j++;
        }
        if(sum>mSum){
mSum = sum;
        }


return mSum;



    }
    public static void main(String[] args) {
        
        int [] a = {10,20,30,5,10,50};
        int ans = sum(a,6);
        System.out.println(ans);
    }
    
}
