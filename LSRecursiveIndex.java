import java.util.*;
public class LSRecursiveIndex {
    public static int ls(int [] a ,int idx,int target){
        if(idx==a.length){
            return -1;
        }
        if(a[idx]==target){
            return idx;
        }else{
            return ls(a,idx+1,target);
        }

    }




    public static void main(String[] args) {
        int a[] = {2,3,5,20,1};
        int n = a.length;
        int ansIndex = ls(a,0,1);

       System.out.println("Target found at the index: "+ ansIndex);
    }
    
}




