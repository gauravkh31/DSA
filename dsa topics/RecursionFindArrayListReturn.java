import java.util.*;
public class RecursionFindArrayListReturn {

    public static ArrayList<Integer> ls(int a[], int target, int index){

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index == a.length){
            return list;
        }
        if(a[index]==target){
            list.add(index);
        }

            ArrayList<Integer> listFromBelowCalls = ls(a,target,index+1);
            list.addAll(listFromBelowCalls);
            return list;
        
    }
    public static void main(String[] args) {
        int a[] = {11,12,13,13,14,13};
        int target = 13;
        ArrayList<Integer> al = ls(a,target,0);
        System.out.println(al);
    }
    
}
