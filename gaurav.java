

import java.util.*;
public class gaurav{
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int target = 7;
        int count = 0;
        int i = 0; 
        int j = a.length-1;
       
        while(i<j){
        int sum = a[i]+a[j];
        if(sum == target){
            i++;
            j--;
           
           count++;
        }
        else if(sum<target){
            i++;
        
          
        }
        else{
            j--;
      
        }
        if(i==j){
            break;
        }
       
    }
   
System.out.println(count);
}
}
