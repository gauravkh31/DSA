import java.util.Scanner;
public class MaximumSumOfKSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of window");
        int k = sc.nextInt();
        int [] a  = { 2,3,1,4,3,2,2,1,3,4,8};
        int n = a.length;
        int sum = 0; 
        int mx = 0; 
        // making prefix sum array 
        for(int p = 1; p < n ; p++){
            a[p] = a[p]+a[p-1];
        }
        int i = 0; 
        int j = k-1;

        while (j<n) {
           if(i==0){
            sum = a[j];
            i++;
                j++;
            if(sum > mx){
                mx = sum;
                
            }
           }else{
            sum = a[j] - a[i-1];
            i++;
            j++;
            if(sum > mx){
                mx = sum;
               
            }
           }
        }
System.out.println("The maximum sum is: "+mx);
sc.close();

    }
    
}
