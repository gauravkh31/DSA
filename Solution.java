// public class SubArraysSum {
//     public static void main(String[] args) {
//         int [] a = {-1,-7,5,4,3,-7,0,0,5,2,-2};
//         int n = a.length;
//         int maxSum=0;
//         for(int i =0; i < n ; i++){
            
//             for(int j = i ; j < n; j++){
//                 int sum =0; 
//                 for(int k =i; k <=j ; k++){
//                     System.out.print(a[k]+" ");
//                     sum = sum+a[k];
//                 }
//                 if(sum>maxSum){
//                     maxSum=sum;
//                 }
//                 System.out.println();
//             }
            
//         }
        
//         System.out.print("Maximum Sum is: "+ maxSum);
//     }
// }





public class Solution {
public static void main(String[] args) {
    int [] a = {}
}
    public static int maxSubArray(int[] nums) {
        int n = nums.length;

        for(int i =1; i < n ; i++){
            nums[i]+=nums[i-1];
        }
        int maxSum= Integer.MIN_VALUE;

        for(int i =0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i==0){
                    int prefixSum=nums[j];
                    if(prefixSum>maxSum){
                        maxSum=prefixSum;
                    }}
                    else{
                        int prefixSum=nums[j]-nums[i-1];
                        if(prefixSum>maxSum){
                        maxSum=prefixSum;
                    }
                        
                    }
                }
            }
        
        return maxSum;
    }
}